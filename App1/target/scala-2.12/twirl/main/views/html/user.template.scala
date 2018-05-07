
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[CreateUserForm],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(us: Form[CreateUserForm])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
	"""),_display_(/*6.3*/request/*6.10*/.messages(key)),format.raw/*6.24*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
	"""),_display_(/*10.3*/form(routes.UserController.addUser())/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
		"""),_display_(/*11.4*/inputText(us("name"))),format.raw/*11.25*/("""

		"""),_display_(/*13.4*/CSRF/*13.8*/.formField),format.raw/*13.18*/("""

		"""),format.raw/*15.3*/("""<div class="buttons">
			<input type="submit" value="Add category"/>
		</div>
	""")))}),format.raw/*18.3*/("""
""")))}))
      }
    }
  }

  def render(us:Form[CreateUserForm],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(us)(request)

  def f:((Form[CreateUserForm]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (us) => (request) => apply(us)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 06 15:28:59 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/user.scala.html
                  HASH: b4b4460cf5d617f4ac89f0bd6f3df6656815f048
                  MATRIX: 764->1|904->71|948->69|975->87|1002->89|1016->96|1049->121|1095->130|1123->133|1138->140|1172->154|1203->156|1231->159|1265->185|1304->187|1333->190|1379->227|1419->229|1449->233|1491->254|1522->259|1534->263|1565->273|1596->277|1706->357
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|37->13|37->13|39->15|42->18
                  -- GENERATED --
              */
          