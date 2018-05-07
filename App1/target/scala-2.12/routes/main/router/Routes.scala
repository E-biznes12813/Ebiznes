// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/conf/routes
// @DATE:Mon May 07 21:22:25 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProductController_3: controllers.ProductController,
  // @LINE:10
  CategoryController_5: controllers.CategoryController,
  // @LINE:14
  UserController_4: controllers.UserController,
  // @LINE:18
  OpinionController_2: controllers.OpinionController,
  // @LINE:22
  KoszykController_0: controllers.KoszykController,
  // @LINE:26
  ProductKoszykController_6: controllers.ProductKoszykController,
  // @LINE:30
  ZamowienieController_1: controllers.ZamowienieController,
  // @LINE:35
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProductController_3: controllers.ProductController,
    // @LINE:10
    CategoryController_5: controllers.CategoryController,
    // @LINE:14
    UserController_4: controllers.UserController,
    // @LINE:18
    OpinionController_2: controllers.OpinionController,
    // @LINE:22
    KoszykController_0: controllers.KoszykController,
    // @LINE:26
    ProductKoszykController_6: controllers.ProductKoszykController,
    // @LINE:30
    ZamowienieController_1: controllers.ZamowienieController,
    // @LINE:35
    Assets_7: controllers.Assets
  ) = this(errorHandler, ProductController_3, CategoryController_5, UserController_4, OpinionController_2, KoszykController_0, ProductKoszykController_6, ZamowienieController_1, Assets_7, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductController_3, CategoryController_5, UserController_4, OpinionController_2, KoszykController_0, ProductKoszykController_6, ZamowienieController_1, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addproduct""", """controllers.ProductController.addProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ProductController.getProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """category""", """controllers.CategoryController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcategory""", """controllers.CategoryController.addCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categorys""", """controllers.CategoryController.getCategory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinion""", """controllers.OpinionController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addopinion""", """controllers.OpinionController.addOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """opinions""", """controllers.OpinionController.getOpinion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """koszyk""", """controllers.KoszykController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addkoszyk""", """controllers.KoszykController.addKoszyk"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """koszyki""", """controllers.KoszykController.getKoszyk"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """koszykProduct""", """controllers.ProductKoszykController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addkoszykProduct""", """controllers.ProductKoszykController.addProductKoszyk"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """koszykProducts""", """controllers.ProductKoszykController.getKoszykProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zamowienie""", """controllers.ZamowienieController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addzamowienie""", """controllers.ZamowienieController.addZamowienie"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """zamowienia""", """controllers.ZamowienieController.getZamowienie"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProductController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductController_index0_invoker = createInvoker(
    ProductController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ProductController_addProduct1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addproduct")))
  )
  private[this] lazy val controllers_ProductController_addProduct1_invoker = createInvoker(
    ProductController_3.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "addProduct",
      Nil,
      "POST",
      this.prefix + """addproduct""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ProductController_getProducts2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ProductController_getProducts2_invoker = createInvoker(
    ProductController_3.getProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductController",
      "getProducts",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CategoryController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("category")))
  )
  private[this] lazy val controllers_CategoryController_index3_invoker = createInvoker(
    CategoryController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "index",
      Nil,
      "GET",
      this.prefix + """category""",
      """ kategorie""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CategoryController_addCategory4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcategory")))
  )
  private[this] lazy val controllers_CategoryController_addCategory4_invoker = createInvoker(
    CategoryController_5.addCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "addCategory",
      Nil,
      "POST",
      this.prefix + """addcategory""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CategoryController_getCategory5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categorys")))
  )
  private[this] lazy val controllers_CategoryController_getCategory5_invoker = createInvoker(
    CategoryController_5.getCategory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoryController",
      "getCategory",
      Nil,
      "GET",
      this.prefix + """categorys""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_index6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_index6_invoker = createInvoker(
    UserController_4.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      this.prefix + """user""",
      """ user""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_addUser7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_UserController_addUser7_invoker = createInvoker(
    UserController_4.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """adduser""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_getUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUser8_invoker = createInvoker(
    UserController_4.getUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Nil,
      "GET",
      this.prefix + """users""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_OpinionController_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinion")))
  )
  private[this] lazy val controllers_OpinionController_index9_invoker = createInvoker(
    OpinionController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "index",
      Nil,
      "GET",
      this.prefix + """opinion""",
      """ opinion""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_OpinionController_addOpinion10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addopinion")))
  )
  private[this] lazy val controllers_OpinionController_addOpinion10_invoker = createInvoker(
    OpinionController_2.addOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "addOpinion",
      Nil,
      "POST",
      this.prefix + """addopinion""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_OpinionController_getOpinion11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("opinions")))
  )
  private[this] lazy val controllers_OpinionController_getOpinion11_invoker = createInvoker(
    OpinionController_2.getOpinion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OpinionController",
      "getOpinion",
      Nil,
      "GET",
      this.prefix + """opinions""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_KoszykController_index12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("koszyk")))
  )
  private[this] lazy val controllers_KoszykController_index12_invoker = createInvoker(
    KoszykController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KoszykController",
      "index",
      Nil,
      "GET",
      this.prefix + """koszyk""",
      """ koszyk""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_KoszykController_addKoszyk13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addkoszyk")))
  )
  private[this] lazy val controllers_KoszykController_addKoszyk13_invoker = createInvoker(
    KoszykController_0.addKoszyk,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KoszykController",
      "addKoszyk",
      Nil,
      "POST",
      this.prefix + """addkoszyk""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_KoszykController_getKoszyk14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("koszyki")))
  )
  private[this] lazy val controllers_KoszykController_getKoszyk14_invoker = createInvoker(
    KoszykController_0.getKoszyk,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.KoszykController",
      "getKoszyk",
      Nil,
      "GET",
      this.prefix + """koszyki""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProductKoszykController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("koszykProduct")))
  )
  private[this] lazy val controllers_ProductKoszykController_index15_invoker = createInvoker(
    ProductKoszykController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductKoszykController",
      "index",
      Nil,
      "GET",
      this.prefix + """koszykProduct""",
      """ produkty do koszyka""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProductKoszykController_addProductKoszyk16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addkoszykProduct")))
  )
  private[this] lazy val controllers_ProductKoszykController_addProductKoszyk16_invoker = createInvoker(
    ProductKoszykController_6.addProductKoszyk,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductKoszykController",
      "addProductKoszyk",
      Nil,
      "POST",
      this.prefix + """addkoszykProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProductKoszykController_getKoszykProducts17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("koszykProducts")))
  )
  private[this] lazy val controllers_ProductKoszykController_getKoszykProducts17_invoker = createInvoker(
    ProductKoszykController_6.getKoszykProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductKoszykController",
      "getKoszykProducts",
      Nil,
      "GET",
      this.prefix + """koszykProducts""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ZamowienieController_index18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zamowienie")))
  )
  private[this] lazy val controllers_ZamowienieController_index18_invoker = createInvoker(
    ZamowienieController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ZamowienieController",
      "index",
      Nil,
      "GET",
      this.prefix + """zamowienie""",
      """ zamowienie""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ZamowienieController_addZamowienie19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addzamowienie")))
  )
  private[this] lazy val controllers_ZamowienieController_addZamowienie19_invoker = createInvoker(
    ZamowienieController_1.addZamowienie,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ZamowienieController",
      "addZamowienie",
      Nil,
      "POST",
      this.prefix + """addzamowienie""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ZamowienieController_getZamowienie20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("zamowienia")))
  )
  private[this] lazy val controllers_ZamowienieController_getZamowienie20_invoker = createInvoker(
    ZamowienieController_1.getZamowienie,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ZamowienieController",
      "getZamowienie",
      Nil,
      "GET",
      this.prefix + """zamowienia""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProductController_index0_route(params@_) =>
      call { 
        controllers_ProductController_index0_invoker.call(ProductController_3.index)
      }
  
    // @LINE:7
    case controllers_ProductController_addProduct1_route(params@_) =>
      call { 
        controllers_ProductController_addProduct1_invoker.call(ProductController_3.addProduct)
      }
  
    // @LINE:8
    case controllers_ProductController_getProducts2_route(params@_) =>
      call { 
        controllers_ProductController_getProducts2_invoker.call(ProductController_3.getProducts)
      }
  
    // @LINE:10
    case controllers_CategoryController_index3_route(params@_) =>
      call { 
        controllers_CategoryController_index3_invoker.call(CategoryController_5.index)
      }
  
    // @LINE:11
    case controllers_CategoryController_addCategory4_route(params@_) =>
      call { 
        controllers_CategoryController_addCategory4_invoker.call(CategoryController_5.addCategory)
      }
  
    // @LINE:12
    case controllers_CategoryController_getCategory5_route(params@_) =>
      call { 
        controllers_CategoryController_getCategory5_invoker.call(CategoryController_5.getCategory)
      }
  
    // @LINE:14
    case controllers_UserController_index6_route(params@_) =>
      call { 
        controllers_UserController_index6_invoker.call(UserController_4.index)
      }
  
    // @LINE:15
    case controllers_UserController_addUser7_route(params@_) =>
      call { 
        controllers_UserController_addUser7_invoker.call(UserController_4.addUser)
      }
  
    // @LINE:16
    case controllers_UserController_getUser8_route(params@_) =>
      call { 
        controllers_UserController_getUser8_invoker.call(UserController_4.getUser)
      }
  
    // @LINE:18
    case controllers_OpinionController_index9_route(params@_) =>
      call { 
        controllers_OpinionController_index9_invoker.call(OpinionController_2.index)
      }
  
    // @LINE:19
    case controllers_OpinionController_addOpinion10_route(params@_) =>
      call { 
        controllers_OpinionController_addOpinion10_invoker.call(OpinionController_2.addOpinion)
      }
  
    // @LINE:20
    case controllers_OpinionController_getOpinion11_route(params@_) =>
      call { 
        controllers_OpinionController_getOpinion11_invoker.call(OpinionController_2.getOpinion)
      }
  
    // @LINE:22
    case controllers_KoszykController_index12_route(params@_) =>
      call { 
        controllers_KoszykController_index12_invoker.call(KoszykController_0.index)
      }
  
    // @LINE:23
    case controllers_KoszykController_addKoszyk13_route(params@_) =>
      call { 
        controllers_KoszykController_addKoszyk13_invoker.call(KoszykController_0.addKoszyk)
      }
  
    // @LINE:24
    case controllers_KoszykController_getKoszyk14_route(params@_) =>
      call { 
        controllers_KoszykController_getKoszyk14_invoker.call(KoszykController_0.getKoszyk)
      }
  
    // @LINE:26
    case controllers_ProductKoszykController_index15_route(params@_) =>
      call { 
        controllers_ProductKoszykController_index15_invoker.call(ProductKoszykController_6.index)
      }
  
    // @LINE:27
    case controllers_ProductKoszykController_addProductKoszyk16_route(params@_) =>
      call { 
        controllers_ProductKoszykController_addProductKoszyk16_invoker.call(ProductKoszykController_6.addProductKoszyk)
      }
  
    // @LINE:28
    case controllers_ProductKoszykController_getKoszykProducts17_route(params@_) =>
      call { 
        controllers_ProductKoszykController_getKoszykProducts17_invoker.call(ProductKoszykController_6.getKoszykProducts)
      }
  
    // @LINE:30
    case controllers_ZamowienieController_index18_route(params@_) =>
      call { 
        controllers_ZamowienieController_index18_invoker.call(ZamowienieController_1.index)
      }
  
    // @LINE:31
    case controllers_ZamowienieController_addZamowienie19_route(params@_) =>
      call { 
        controllers_ZamowienieController_addZamowienie19_invoker.call(ZamowienieController_1.addZamowienie)
      }
  
    // @LINE:32
    case controllers_ZamowienieController_getZamowienie20_route(params@_) =>
      call { 
        controllers_ZamowienieController_getZamowienie20_invoker.call(ZamowienieController_1.getZamowienie)
      }
  
    // @LINE:35
    case controllers_Assets_versioned21_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
