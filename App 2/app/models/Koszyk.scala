package models

import play.api.libs.json._

case class Koszyk(id: Int, user: String, product: Int,productName:String, liczba: Int)

object Koszyk {
  implicit val koszykFormat = Json.format[Koszyk]
}






