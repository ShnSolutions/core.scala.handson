package org.shn.handson.scala.functions

/**
 * @author ravibabu.mathi
 */
object FunctionExample1 {
  
  
 /*
  * function definition
  * def <function Name>[( [ [<argumentName>:<argument Type>], ... ]   )][:<return data type> =] [{ <body> } | <body>]   
 */
  
  def function1() {
  }
  
  def function1(arg1:Int, arg2:Int):Unit ={
  }

  def function2(arg1:Int, arg2:Int):Int = {
    return arg1+ arg2;
  }

  def function1(arg1:Int, arg2:Int, arg3:Int):Int = arg1+ arg2+ arg3;
  
  def function2(arg1:Int, arg2:Int, arg3:Int) = arg1+ arg2+ arg3;

  
  
  def main(args: Array[String]): Unit = {
    
  }
}