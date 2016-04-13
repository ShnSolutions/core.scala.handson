package org.sunsys.handson.scala.functions.tail.recursion

object TailRecursionExample2 {
  
  
  def sum(f: Int => Int, a:Int, b:Int):Int = {

    /*
     * tail recursion 
     * 
     * also "loop" function is a closer function
     */
    def loop(sum:Int, a:Int):Int = {
      
      if( a > b) return sum

      loop(sum +f(a), a+1)
    }
    
    loop(0, a)
    
  }
  
  
  def main(args : Array[String]) {
   
    /* anonymous function is passed to sum function */
    println( sum( (x => x*x), 1, 5))
  }
  
}