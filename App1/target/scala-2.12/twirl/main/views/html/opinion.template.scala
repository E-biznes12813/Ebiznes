
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

object opinion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[CreateOpinionForm],Seq[Product],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opinion: Form[CreateOpinionForm],product: Seq[Product])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/request/*5.9*/.flash.get("success").map/*5.34*/ { key =>_display_(Seq[Any](format.raw/*5.43*/("""
   """),_display_(/*6.5*/request/*6.12*/.messages(key)),format.raw/*6.26*/("""
""")))}),format.raw/*7.2*/("""

"""),_display_(/*9.2*/main("Welcome to Ebiznes")/*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
  """),_display_(/*10.4*/form(routes.OpinionController.addOpinion())/*10.47*/ {_display_(Seq[Any](format.raw/*10.49*/("""
		"""),_display_(/*11.4*/inputText(opinion("opin"))),format.raw/*11.30*/("""

	  """),format.raw/*13.4*/("""<select name="product" id="product">
		"""),_display_(/*14.4*/for(prod <- product) yield /*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
			"""),format.raw/*15.4*/("""<option value=""""),_display_(/*15.20*/prod/*15.24*/.id),format.raw/*15.27*/("""">"""),_display_(/*15.30*/prod/*15.34*/.name),format.raw/*15.39*/("""</option>
		""")))}),format.raw/*16.4*/("""
	  """),format.raw/*17.4*/("""</select>


		"""),_display_(/*20.4*/CSRF/*20.8*/.formField),format.raw/*20.18*/("""

		"""),format.raw/*22.3*/("""<div class="buttons">
			<input type="submit" value="Add Opinion"/>
		</div>
	""")))}),format.raw/*25.3*/("""
""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(opinion:Form[CreateOpinionForm],product:Seq[Product],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(opinion,product)(request)

  def f:((Form[CreateOpinionForm],Seq[Product]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (opinion,product) => (request) => apply(opinion,product)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun May 06 18:48:36 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/app/views/opinion.scala.html
                  HASH: 8e76ebd0c20b393bb2c526f346128c630519f6e0
                  MATRIX: 783->1|953->101|997->99|1024->117|1051->119|1065->126|1098->151|1144->160|1174->165|1189->172|1223->186|1254->188|1282->191|1316->217|1355->219|1385->223|1437->266|1477->268|1507->272|1554->298|1586->303|1652->343|1688->363|1727->364|1758->368|1801->384|1814->388|1838->391|1868->394|1881->398|1907->403|1950->416|1981->420|2022->435|2034->439|2065->449|2096->453|2205->532|2237->534
                  LINES: 21->1|24->3|27->2|28->4|29->5|29->5|29->5|29->5|30->6|30->6|30->6|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|39->15|40->16|41->17|44->20|44->20|44->20|46->22|49->25|50->26
                  -- GENERATED --
              */
          