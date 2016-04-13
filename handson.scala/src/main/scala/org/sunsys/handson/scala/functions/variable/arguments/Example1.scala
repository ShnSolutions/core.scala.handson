package org.sunsys.handson.scala.functions.variable.arguments

/**
 * @author ravibabu.mathi
 */
object Example1 {
    /*
   * 
   */
  def varArguments(args:String*) {
    println("variable arguments are:"+args);
  }


  def main(args:Array[String]) {
   
        /* call method/function with the variable argument */
    varArguments("one", "two", "three", "four");
    varArguments("one", "two", "three", "four", "five", "six");
    

  }

  
}

