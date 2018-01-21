package edu.knoldus


import java.io.{File, PrintWriter}

import org.json4s.DefaultFormats
import org.json4s.jackson.Serialization.{write, _}

object Operation extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  def writeToFile(person: Person): Unit = {
    val pw = new PrintWriter(new File("person.txt"))
    val jsonString = write(person)
    pw.append(jsonString)
    pw.close()
  }

  def readFromFile(): Unit = {
    val lines = scala.io.Source.fromFile("person.txt").mkString
    val obj: Person = read[Person](lines)
    print(obj.toString)
  }

}

