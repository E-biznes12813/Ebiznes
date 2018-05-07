
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

object koszykProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[CreateProductKoszykForm],Seq[Product],Seq[Koszyk],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productKoszyk: Form[CreateProductKoszykForm],products: Seq[Product], koszyks: Seq[Koszyk])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductKoszykController.addProductKoszyk())/*10.59*/ {_display_(Seq[Any](format.raw/*10.61*/("""
	  """),_display_(/*11.5*/inputText(productKoszyk("liczba"))),format.raw/*11.39*/("""

	  """),format.raw/*13.4*/("""<select name="product" id="product">
	  """),_display_(/*14.5*/for(pro <- products) yield /*14.25*/{_display_(Seq[Any](format.raw/*14.26*/("""
		  """),format.raw/*15.5*/("""<option value=""""),_display_(/*15.21*/pro/*15.24*/.id),format.raw/*15.27*/("""">"""),_display_(/*15.30*/pro/*15.33*/.name),format.raw/*15.38*/("""</option>
	  """)))}),format.raw/*16.5*/("""
	  """),format.raw/*17.4*/("""</select>

	  <select name="koszyk" id="koszyk">
	  """),_display_(/*20.5*/for(kos <- koszyks) yield /*20.24*/{_display_(Seq[Any](format.raw/*20.25*/("""
		  """),format.raw/*21.5*/("""<option value=""""),_display_(/*21.21*/kos/*21.24*/.id),format.raw/*21.27*/("""">"""),_display_(/*21.30*/kos/*21.33*/.id),format.raw/*21.36*/("""</option>
	  """)))}),format.raw/*22.5*/("""
	  """),format.raw/*23.4*/("""</select>


		"""),_display_(/*26.4*/CSRF/*26.8*/.formField),format.raw/*26.18*/("""

		"""),format.raw/*28.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*31.3*/("""
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(productKoszyk:Form[CreateProductKoszykForm],products:Seq[Product],koszyks:Seq[Koszyk],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(productKoszyk,products,koszyks)(request)

  def f:((Form[CreateProductKoszykForm],Seq[Product],Seq[Koszyk]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (productKoszyk,products,koszyks) => (request) => apply(productKoszyk,products,koszyks)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 20:51:49 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/koszykProduct.scala.html
                  HASH: e7da198f87fdff128dac57ebe67b91b2761e43c1
                  MATRIX: 807->1|1012->136|1056->134|1083->152|1110->154|1124->161|1157->186|1203->195|1233->200|1248->207|1282->221|1313->223|1341->226|1375->252|1414->254|1444->258|1508->313|1548->315|1579->320|1634->354|1666->359|1733->400|1769->420|1808->421|1840->426|1883->442|1895->445|1919->448|1949->451|1961->454|1987->459|2031->473|2062->477|2141->530|2176->549|2215->550|2247->555|2290->571|2302->574|2326->577|2356->580|2368->583|2392->586|2436->600|2467->604|2508->619|2520->623|2551->633|2582->637|2691->716|2723->718
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|50->26|50->26|50->26|52->28|55->31|56->32
                  -- GENERATED --
              */
          