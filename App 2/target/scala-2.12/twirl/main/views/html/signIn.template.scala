
package views.html

/*2.2*/import play.api.data.Form
/*3.2*/import play.api.i18n.Messages
/*4.2*/import play.api.mvc.RequestHeader
/*5.2*/import org.webjars.play.WebJarsUtil
/*6.2*/import controllers.AssetsFinder
/*7.2*/import com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry
/*8.2*/import forms.SignInForm.Data
/*9.2*/import b3.inline.fieldConstructor

object signIn extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Form[Data],SocialProviderRegistry,RequestHeader,Messages,WebJarsUtil,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*11.2*/(signInForm: Form[Data], socialProviders: SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarsUtil: WebJarsUtil, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*12.1*/("""
"""),_display_(/*13.2*/main(messages("Zaloguj się"))/*13.31*/ {_display_(Seq[Any](format.raw/*13.33*/("""
    """),format.raw/*14.5*/("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""),_display_(/*15.18*/messages("sign.in.credentials")),format.raw/*15.49*/("""</legend>

        """),_display_(/*17.10*/if(socialProviders.providers.nonEmpty)/*17.48*/ {_display_(Seq[Any](format.raw/*17.50*/("""
            """),format.raw/*18.13*/("""<div class="social-providers">
                <div>

                    <a href="/authenticate/google" class="provider google" title="google"><img src="/assets/images/providers/google.png" width="64px" height="64px" alt="google"></a>

                </div>
            </div>
        """)))}),format.raw/*25.10*/("""

    """),format.raw/*27.5*/("""</fieldset>
""")))}))
      }
    }
  }

  def render(signInForm:Form[Data],socialProviders:SocialProviderRegistry,request:RequestHeader,messages:Messages,webJarsUtil:WebJarsUtil,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def f:((Form[Data],SocialProviderRegistry) => (RequestHeader,Messages,WebJarsUtil,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (signInForm,socialProviders) => (request,messages,webJarsUtil,assets) => apply(signInForm,socialProviders)(request,messages,webJarsUtil,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 19:53:18 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/dfdfdf/eeeebbbbbiiiizzznnneeesss/app/views/signIn.scala.html
                  HASH: 21f5d6586724c6d0853ed913cf19c2d672a0b2f8
                  MATRIX: 28->2|61->29|98->60|139->95|182->132|221->165|300->238|336->268|751->304|1012->471|1040->473|1078->502|1118->504|1150->509|1238->570|1290->601|1337->621|1384->659|1424->661|1465->674|1784->962|1817->968
                  LINES: 4->2|5->3|6->4|7->5|8->6|9->7|10->8|11->9|16->11|21->12|22->13|22->13|22->13|23->14|24->15|24->15|26->17|26->17|26->17|27->18|34->25|36->27
                  -- GENERATED --
              */
          