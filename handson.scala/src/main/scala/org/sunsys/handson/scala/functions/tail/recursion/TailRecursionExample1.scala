package org.sunsys.handson.scala.functions.tail.recursion

object TailRecursionExample1 {
  
  def factorial(n:Int) : Int = {

    /* loop function is a tail recursion function */
    def loop(x:Int, n:Int):Int = {
      if(n<=1) return x*1

      /* if a function calls itself as its last action, the function's stak frame can be reused. 
       * This is called "Tail Recursion" */
      loop(x*n, n-1) ;       
    }
    
    loop(1, n)
  }
  
  
  def main(args: Array[String]): Unit = {
  
    val factValue = factorial(25);
    
    println("factorial is:"+factValue);
    
  }

}