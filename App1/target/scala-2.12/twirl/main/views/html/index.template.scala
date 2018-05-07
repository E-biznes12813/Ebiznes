
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateProductForm],Seq[Category],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(product: Form[CreateProductForm],category: Seq[Category])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.ProductController.addProduct())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(product("name"))),format.raw/*11.30*/("""
		"""),_display_(/*12.4*/inputText(product("description"))),format.raw/*12.37*/("""
	  	"""),_display_(/*13.6*/inputText(product("kayword"))),format.raw/*13.35*/("""

	  """),format.raw/*15.4*/("""<select name="category" id="category">
		"""),_display_(/*16.4*/for(cat <- category) yield /*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
			"""),format.raw/*17.4*/("""<option value=""""),_display_(/*17.20*/cat/*17.23*/.id),format.raw/*17.26*/("""">"""),_display_(/*17.29*/cat/*17.32*/.name),format.raw/*17.37*/("""</option>
		""")))}),format.raw/*18.4*/("""
	  """),format.raw/*19.4*/("""</select>


		"""),_display_(/*22.4*/CSRF/*22.8*/.formField),format.raw/*22.18*/("""

		"""),format.raw/*24.3*/("""<div class="buttons">
			<input type="submit" value="Add Product"/>
		</div>
	""")))}),format.raw/*27.3*/("""
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(product:Form[CreateProductForm],category:Seq[Category],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(product,category)(request)

  def f:((Form[CreateProductForm],Seq[Category]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (product,category) => (request) => apply(product,category)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 20:56:18 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/index.scala.html
                  HASH: a6bfbb4b441c72e2ff19e76094a2fe7e0f7f4f8f
                  MATRIX: 782->1|954->103|998->101|1025->119|1052->121|1066->128|1099->153|1145->162|1175->167|1190->174|1224->188|1255->190|1283->193|1317->219|1356->221|1386->225|1438->268|1478->270|1508->274|1555->300|1585->304|1639->337|1671->343|1721->372|1753->377|1821->419|1857->439|1896->440|1927->444|1970->460|1982->463|2006->466|2036->469|2048->472|2074->477|2117->490|2148->494|2189->509|2201->513|2232->523|2263->527|2372->606|2404->608
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|36->12|36->12|37->13|37->13|39->15|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|41->17|41->17|42->18|43->19|46->22|46->22|46->22|48->24|51->27|52->28
                  -- GENERATED --
              */
          