// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/darek/Desktop/eeeebbbbbiiiizzznnneeesss/conf/routes
// @DATE:Mon May 07 21:22:25 CEST 2018


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
