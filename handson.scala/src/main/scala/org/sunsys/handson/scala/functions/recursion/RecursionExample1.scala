package org.sunsys.handson.scala.functions.recursion

object RecursionExample1 {
 
  def factorial(n:Int) : Int = {

    /* this is not a tail recursion */
    /* this is just a normal recursion function */
    
    if(n<=1) return 1
    return n * factorial(n-1)
  }
  
  def main(args: Array[String]): Unit = {
  
    val factValue = factorial(4);
    
    println("factorial is:"+factValue);
    
  }
}
