package models

import play.api.libs.json._

case class Koszyk(id: Int, user: Int)

object Koszyk {
  implicit val koszykFormat = Json.format[Koszyk]
}






