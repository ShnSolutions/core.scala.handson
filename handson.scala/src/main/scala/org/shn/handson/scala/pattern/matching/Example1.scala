package org.shn.handson.scala.pattern.matching

object Example1 {
  
  def main(args: Array[String]): Unit = {
   
    val value = 5
    
    value match {
      case 1 => println(" one")
      case 2 => println(" two")
      case 3 => println(" three")
      case 4 => println(" four")
      case _ => println(" defailt case is selected")
    }
  }
  
}