package edu.knoldus
@SerialVersionUID(hashCode())
class Address(val street: String, val houseNum: Int, val city: String) {
  override def toString: String = s"$street $houseNum $city"
}
