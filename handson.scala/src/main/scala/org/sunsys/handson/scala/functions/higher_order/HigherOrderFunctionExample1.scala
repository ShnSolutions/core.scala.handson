package org.sunsys.handson.scala.functions.higher_order

/**
 * @author ravibabu.mathi
 */
class HigherOrderFunctionExample1 {
 


  def sum(f:(Int)=>Int, i:Int, n:Int):Int = {
    var sum = 0;
    for( i <- i to n) {
    	sum += f(i)
    }
    return sum;
  }

  
  def squres(x:Int):Int = {
    return x*x
  }

  def sumOfSqures(i:Int, n:Int) = {
    
    /* passing function:"squres" as an argument to another function:"sum" */
    val sumOfSqrts = sum(squres,i, n);
    
    println("Sum of squres is:"+sumOfSqrts);
  }
  
  def main(args: Array[String]) {

    sumOfSqures(1, 5) 
    sumOfSqures(5, 10) 
  }
}