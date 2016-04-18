package org.shn.handson.scala.control.structures.for_construct

object Example2 {
  
  def main(args: Array[String]): Unit = {
    
    
    for (i <- 5 to 10 ) 
      println("i value :"+i)
      
    for (i <- 10 until 15 ) 
      println("until loop, i value :"+i)
      
  }
}