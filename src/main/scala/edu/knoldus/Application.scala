package edu.knoldus

import edu.knoldus.Operation.{readFromFile, writeToFile}

object Application {
  val age: Int = 23
  val salary: Double = 20000
  val luckyNo: Int = 5
  val houseNo: Int = 1
  val person = new Person("miral",age,"monday", new Address("rk", 1, "delhi"),salary,luckyNo)
  writeToFile(person)
  readFromFile()
}
