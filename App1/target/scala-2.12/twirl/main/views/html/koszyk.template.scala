
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

object koszyk extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateKoszykForm],Seq[User],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(kosz: Form[CreateKoszykForm],product: Seq[User])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.KoszykController.addKoszyk())/*10.45*/ {_display_(Seq[Any](format.raw/*10.47*/("""

	  """),format.raw/*12.4*/("""<select name="user" id="user">
	  """),_display_(/*13.5*/for(prod <- product) yield /*13.25*/{_display_(Seq[Any](format.raw/*13.26*/("""
		  """),format.raw/*14.5*/("""<option value=""""),_display_(/*14.21*/prod/*14.25*/.id),format.raw/*14.28*/("""">"""),_display_(/*14.31*/prod/*14.35*/.name),format.raw/*14.40*/("""</option>
	  """)))}),format.raw/*15.5*/("""
	  """),format.raw/*16.4*/("""</select>

		"""),_display_(/*18.4*/CSRF/*18.8*/.formField),format.raw/*18.18*/("""

		"""),format.raw/*20.3*/("""<div class="buttons">
			<input type="submit" value="dodaj koszyk"/>
		</div>
	""")))}),format.raw/*23.3*/("""
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(kosz:Form[CreateKoszykForm],product:Seq[User],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(kosz,product)(request)

  def f:((Form[CreateKoszykForm],Seq[User]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (kosz,product) => (request) => apply(kosz,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 20:56:18 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/koszyk.scala.html
                  HASH: 0f04d8c9ca15884e2b3f67b9f5387e9ca5b54fa9
                  MATRIX: 778->1|941->94|985->92|1012->110|1039->112|1053->119|1086->144|1132->153|1162->158|1177->165|1211->179|1242->181|1270->184|1304->210|1343->212|1373->216|1423->257|1463->259|1495->264|1556->299|1592->319|1631->320|1663->325|1706->341|1719->345|1743->348|1773->351|1786->355|1812->360|1856->374|1887->378|1927->392|1939->396|1970->406|2001->410|2111->490|2143->492
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|36->12|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|38->14|39->15|40->16|42->18|42->18|42->18|44->20|47->23|48->24
                  -- GENERATED --
              */
          