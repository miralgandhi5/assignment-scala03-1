package edu.knoldus

@SerialVersionUID(hashCode())
class Person(val name: String,val Age: Int,@transient val day: String = "",val address: Address,val salary: Double,@transient val luckyNo: Int = 0) {
  override def toString: String = s"$name $Age $day $address $salary $luckyNo"
}
