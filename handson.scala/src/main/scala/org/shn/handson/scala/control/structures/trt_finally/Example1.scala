package org.shn.handson.scala.control.structures.trt_finally

object Example1 {
 
  def main(args: Array[String]): Unit = {
    
    /* As with most other Scala control structures, 
     * try-catch-finally results in a value
     */


    val value = 
    try {
      0
    }
    catch {
      case _ => 1
    }
    finally {
      2
    }
    
    println("try..catch...finally expression result :"+value)
    
  }
}