package controllers

import javax.inject._
import models._
import play.api.data.Form
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.i18n._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class KoszykController @Inject()(opinionRepo: KoszykRepository, productsRepo: UserRepository,
                                  cc: MessagesControllerComponents
                                 )(implicit ec: ExecutionContext)
  extends MessagesAbstractController(cc) {

  /**
    * The mapping for the person form.
    */

  val koszykForm: Form[CreateKoszykForm] = Form {
    mapping(
      "user" -> number,
    )(CreateKoszykForm.apply)(CreateKoszykForm.unapply)
  }

  /**
    * The index action.
    */
  def index = Action.async { implicit request =>
    val products = productsRepo.list()
    products.map(prod => Ok(views.html.koszyk(koszykForm,prod)))

  }


  def addKoszyk = Action.async { implicit request =>
    // Bind the form first, then fold the result, passing a function to handle errors, and a function to handle succes.
    var a:Seq[User] = Seq[User]()
    val products = productsRepo.list().onComplete{
      case Success(prod) => a=prod
      case Failure(_) => print("fail")
    }

    koszykForm.bindFromRequest.fold(
      // The error function. We return the index page with the error form, which will render the errors.
      // We also wrap the result in a successful future, since this action is synchronous, but we're required to return
      // a future because the person creation function returns a future.
      errorForm => {
        Future.successful(
          Ok(views.html.koszyk(errorForm,a))
        )
      },
      // There were no errors in the from, so create the person.
      koszyk => {
        opinionRepo.create(koszyk.user).map { _ =>
          // If successful, we simply redirect to the index page.
          Redirect(routes.KoszykController.index).flashing("success" -> "product.created")
        }
      }
    )
  }


  /**
    * A REST endpoint that gets all the people as JSON.
    */
  def getKoszyk = Action.async { implicit request =>
    opinionRepo.list().map { op =>
      Ok(Json.toJson(op))
    }
  }
}

/**
  * The create person form.
  *
  * Generally for forms, you should define separate objects to your models, since forms very often need to present data
  * in a different way to your models.  In this case, it doesn't make sense to have an id parameter in the form, since
  * that is generated once it's created.
  */
case class CreateKoszykForm(user: Int)
