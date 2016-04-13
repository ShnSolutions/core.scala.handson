package org.shn.handson.scala.functions

/**
 * @author ravibabu.mathi
 */
object FunctionExample2 {

  /**
   * variable arguments with same data Type
   */
  def function(args:Int*):Int = {
    
    var sum:Int = 0;
    for( arg <- args) {
      sum += arg;
    }
    return sum;
  }
  
  
  //TODO lets have another example to have variable length of Integer and variable length of  String
    
  def main(args: Array[String]): Unit = {
  }
  
}