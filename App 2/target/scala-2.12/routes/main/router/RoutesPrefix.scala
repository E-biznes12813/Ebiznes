// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/darek/Desktop/dfdfdf/eeeebbbbbiiiizzznnneeesss/conf/routes
// @DATE:Sun Jun 17 17:12:23 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
