// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/conf/routes
// @DATE:Mon May 07 21:22:25 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:18
  class ReverseOpinionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def getOpinion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinions")
    }
  
    // @LINE:18
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "opinion")
    }
  
    // @LINE:19
    def addOpinion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addopinion")
    }
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseCategoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addCategory(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addcategory")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "category")
    }
  
    // @LINE:12
    def getCategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categorys")
    }
  
  }

  // @LINE:22
  class ReverseKoszykController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def addKoszyk(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addkoszyk")
    }
  
    // @LINE:24
    def getKoszyk(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "koszyki")
    }
  
    // @LINE:22
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "koszyk")
    }
  
  }

  // @LINE:30
  class ReverseZamowienieController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def addZamowienie(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addzamowienie")
    }
  
    // @LINE:30
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "zamowienie")
    }
  
    // @LINE:32
    def getZamowienie(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "zamowienia")
    }
  
  }

  // @LINE:6
  class ReverseProductController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addproduct")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def getProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
  }

  // @LINE:26
  class ReverseProductKoszykController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getKoszykProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "koszykProducts")
    }
  
    // @LINE:27
    def addProductKoszyk(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addkoszykProduct")
    }
  
    // @LINE:26
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "koszykProduct")
    }
  
  }

  // @LINE:14
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adduser")
    }
  
    // @LINE:16
    def getUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:14
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
  }


}
