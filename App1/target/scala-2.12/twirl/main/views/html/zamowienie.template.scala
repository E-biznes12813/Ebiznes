
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

object zamowienie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateZamowienieForm],Seq[Koszyk],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(zamowienie: Form[CreateZamowienieForm],koszyks: Seq[Koszyk])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ZamowienieController.addZamowienie())/*10.53*/ {_display_(Seq[Any](format.raw/*10.55*/("""
	  """),format.raw/*11.4*/("""<select name="koszyk" id="koszyk">
	  """),_display_(/*12.5*/for(kos <- koszyks) yield /*12.24*/{_display_(Seq[Any](format.raw/*12.25*/("""
		  """),format.raw/*13.5*/("""<option value=""""),_display_(/*13.21*/kos/*13.24*/.id),format.raw/*13.27*/("""">"""),_display_(/*13.30*/kos/*13.33*/.id),format.raw/*13.36*/("""</option>
	  """)))}),format.raw/*14.5*/("""
	  """),format.raw/*15.4*/("""</select>
		"""),_display_(/*16.4*/inputText(zamowienie("dataZam"))),format.raw/*16.36*/("""
		"""),_display_(/*17.4*/inputText(zamowienie("address"))),format.raw/*17.36*/("""
	  	"""),_display_(/*18.6*/inputText(zamowienie("wartosc"))),format.raw/*18.38*/("""




		"""),_display_(/*23.4*/CSRF/*23.8*/.formField),format.raw/*23.18*/("""

		"""),format.raw/*25.3*/("""<div class="buttons">
			<input type="submit" value="Dodaj zamowienie"/>
		</div>
	""")))}),format.raw/*28.3*/("""
""")))}),format.raw/*29.2*/("""
"""))
      }
    }
  }

  def render(zamowienie:Form[CreateZamowienieForm],koszyks:Seq[Koszyk],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(zamowienie,koszyks)(request)

  def f:((Form[CreateZamowienieForm],Seq[Koszyk]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (zamowienie,koszyks) => (request) => apply(zamowienie,koszyks)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 21:24:35 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/zamowienie.scala.html
                  HASH: fed42986e46342fc3605581e0b02eb98eb20133c
                  MATRIX: 788->1|963->106|1007->104|1034->122|1061->124|1075->131|1108->156|1154->165|1184->170|1199->177|1233->191|1264->193|1292->196|1326->222|1365->224|1395->228|1453->277|1493->279|1524->283|1589->322|1624->341|1663->342|1695->347|1738->363|1750->366|1774->369|1804->372|1816->375|1840->378|1884->392|1915->396|1954->409|2007->441|2037->445|2090->477|2122->483|2175->515|2209->523|2221->527|2252->537|2283->541|2397->625|2429->627
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|37->13|38->14|39->15|40->16|40->16|41->17|41->17|42->18|42->18|47->23|47->23|47->23|49->25|52->28|53->29
                  -- GENERATED --
              */
          