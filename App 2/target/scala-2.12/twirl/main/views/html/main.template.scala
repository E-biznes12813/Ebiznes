
package views.html

/*1.2*/import play.api.i18n.Messages
/*2.2*/import play.api.mvc.RequestHeader
/*3.2*/import play.twirl.api.Html
/*4.2*/import org.webjars.play.WebJarsUtil
/*5.2*/import controllers.AssetsFinder

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[String,Option[models.User],Html,RequestHeader,Messages,AssetsFinder,WebJarsUtil,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, assets: AssetsFinder, webJarsUtil: WebJarsUtil):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/assets/*15.65*/.path("images/favicon.png")),format.raw/*15.92*/("""">
        <title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        """),_display_(/*19.10*/Html(webJarsUtil.css("bootstrap.min.css"))),format.raw/*19.52*/("""
        """),_display_(/*20.10*/Html(webJarsUtil.css("bootstrap-theme.min.css"))),format.raw/*20.58*/("""
        """),format.raw/*21.9*/("""<link rel="stylesheet" href=""""),_display_(/*21.39*/assets/*21.45*/.path("styles/main.css")),format.raw/*21.69*/("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""),_display_(/*33.48*/messages("toggle.navigation")),format.raw/*33.77*/("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*38.52*/controllers/*38.63*/.routes.ApplicationController.index),format.raw/*38.98*/("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""),_display_(/*42.39*/controllers/*42.50*/.routes.ApplicationController.index),format.raw/*42.85*/("""">"""),_display_(/*42.88*/messages("home")),format.raw/*42.104*/("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*46.22*/user/*46.26*/.map/*46.30*/ { u =>_display_(Seq[Any](format.raw/*46.37*/("""
                    """),format.raw/*47.21*/("""<li><a href=""""),_display_(/*47.35*/controllers/*47.46*/.routes.ApplicationController.index),format.raw/*47.81*/("""">"""),_display_(/*47.84*/u/*47.85*/.name),format.raw/*47.90*/("""</a></li>
                    <li><a href=""""),_display_(/*48.35*/controllers/*48.46*/.routes.ApplicationController.signOut),format.raw/*48.83*/("""">"""),_display_(/*48.86*/messages("sign.out")),format.raw/*48.106*/("""</a></li>
                    """)))}/*49.22*/.getOrElse/*49.32*/ {_display_(Seq[Any](format.raw/*49.34*/("""
                        """),format.raw/*50.25*/("""<li><a href=""""),_display_(/*50.39*/controllers/*50.50*/.routes.SignInController.view),format.raw/*50.79*/("""">"""),_display_(/*50.82*/messages("sign.in")),format.raw/*50.101*/("""</a></li>

                    """)))}),format.raw/*52.22*/("""
                    """),format.raw/*53.21*/("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """),_display_(/*59.18*/request/*59.25*/.flash.get("error").map/*59.48*/ { msg =>_display_(Seq[Any](format.raw/*59.57*/("""
                    """),format.raw/*60.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*62.34*/messages("error")),format.raw/*62.51*/("""</strong> """),_display_(/*62.62*/msg),format.raw/*62.65*/("""
                    """),format.raw/*63.21*/("""</div>
                """)))}),format.raw/*64.18*/("""
                """),_display_(/*65.18*/request/*65.25*/.flash.get("info").map/*65.47*/ { msg =>_display_(Seq[Any](format.raw/*65.56*/("""
                    """),format.raw/*66.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*68.34*/messages("info")),format.raw/*68.50*/("""</strong> """),_display_(/*68.61*/msg),format.raw/*68.64*/("""
                    """),format.raw/*69.21*/("""</div>
                """)))}),format.raw/*70.18*/("""
                """),_display_(/*71.18*/request/*71.25*/.flash.get("success").map/*71.50*/ { msg =>_display_(Seq[Any](format.raw/*71.59*/("""
                    """),format.raw/*72.21*/("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""),_display_(/*74.34*/messages("success")),format.raw/*74.53*/("""</strong> """),_display_(/*74.64*/msg),format.raw/*74.67*/("""
                    """),format.raw/*75.21*/("""</div>
                """)))}),format.raw/*76.18*/("""
                """),_display_(/*77.18*/content),format.raw/*77.25*/("""
            """),format.raw/*78.13*/("""</div>
        </main>
        """),_display_(/*80.10*/Html(webJarsUtil.script("jquery.min.js"))),format.raw/*80.51*/("""
        """),_display_(/*81.10*/Html(webJarsUtil.script("bootstrap.min.js"))),format.raw/*81.54*/("""
        """),format.raw/*82.9*/("""<script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""),_display_(/*83.23*/assets/*83.29*/.path("javascripts/zxcvbnShim.js")),format.raw/*83.63*/(""""></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,user:Option[models.User],content:Html,request:RequestHeader,messages:Messages,assets:AssetsFinder,webJarsUtil:WebJarsUtil): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def f:((String,Option[models.User]) => (Html) => (RequestHeader,Messages,AssetsFinder,WebJarsUtil) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => (request,messages,assets,webJarsUtil) => apply(title,user)(content)(request,messages,assets,webJarsUtil)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Jun 17 17:45:04 CEST 2018
                  SOURCE: C:/Users/darek/Desktop/dfdfdf/eeeebbbbbiiiizzznnneeesss/app/views/main.scala.html
                  HASH: 5fdf23a0b08758291554e1946eab7ec0ed0a6532
                  MATRIX: 28->1|65->32|106->67|140->95|183->132|591->166|850->332|877->333|1176->605|1191->611|1239->638|1285->657|1311->662|1585->909|1648->951|1685->961|1754->1009|1790->1018|1847->1048|1862->1054|1907->1078|2627->1771|2677->1800|2958->2054|2978->2065|3034->2100|3256->2295|3276->2306|3332->2341|3362->2344|3400->2360|3646->2579|3659->2583|3672->2587|3717->2594|3766->2615|3807->2629|3827->2640|3883->2675|3913->2678|3923->2679|3949->2684|4020->2728|4040->2739|4098->2776|4128->2779|4170->2799|4220->2830|4239->2840|4279->2842|4332->2867|4373->2881|4393->2892|4443->2921|4473->2924|4514->2943|4577->2975|4626->2996|4816->3159|4832->3166|4864->3189|4911->3198|4960->3219|5161->3393|5199->3410|5237->3421|5261->3424|5310->3445|5365->3469|5410->3487|5426->3494|5457->3516|5504->3525|5553->3546|5752->3718|5789->3734|5827->3745|5851->3748|5900->3769|5955->3793|6000->3811|6016->3818|6050->3843|6097->3852|6146->3873|6348->4048|6388->4067|6426->4078|6450->4081|6499->4102|6554->4126|6599->4144|6627->4151|6668->4164|6727->4196|6789->4237|6826->4247|6891->4291|6927->4300|7062->4408|7077->4414|7132->4448
                  LINES: 4->1|5->2|6->3|7->4|8->5|13->7|18->8|19->9|25->15|25->15|25->15|26->16|26->16|29->19|29->19|30->20|30->20|31->21|31->21|31->21|31->21|43->33|43->33|48->38|48->38|48->38|52->42|52->42|52->42|52->42|52->42|56->46|56->46|56->46|56->46|57->47|57->47|57->47|57->47|57->47|57->47|57->47|58->48|58->48|58->48|58->48|58->48|59->49|59->49|59->49|60->50|60->50|60->50|60->50|60->50|60->50|62->52|63->53|69->59|69->59|69->59|69->59|70->60|72->62|72->62|72->62|72->62|73->63|74->64|75->65|75->65|75->65|75->65|76->66|78->68|78->68|78->68|78->68|79->69|80->70|81->71|81->71|81->71|81->71|82->72|84->74|84->74|84->74|84->74|85->75|86->76|87->77|87->77|88->78|90->80|90->80|91->81|91->81|92->82|93->83|93->83|93->83
                  -- GENERATED --
              */
          