package org.shn.handson.scala.functions

/**
 * @author ravibabu.mathi
 */

class Functions {

  def sum(value1: Int, value2: Int) = value1 + value2;

  /*
   * parameter a is pass by value
   * parameter b is pass by name
   */
  def sum(a: Int, b: => Int) = a + b;

  def factorial(a: Int): Int =
    if (a <= 0) 1;
    else a * factorial(a - 1);
  
  /*
   * Function with Default parameters
   */
  def m1(value1:Int=5, value2:Int=10):Int  = value1+value2;


}

object FunctionExample3 {

  def main(args: Array[String]) {
    println("Welcome to the Scala worksheet") //> Welcome to the Scala worksheet

    var sumOjb: Functions = new Functions(); //> sumOjb  : org.sunsys.handson.scala.functions.Functions = org.sunsys.handson.
    //| scala.functions.Functions@96532d6

    var a: Int = 10; //> a  : Int = 10
    var b: Int = 20; //> b  : Int = 20

    val c = sumOjb.sum(a, b); //> c  : Int = 30
    val d = sumOjb sum (a, b); // is equivalent of sumOjb.sum(a, b)     ;
    
    /* named parameters */
    val e = sumOjb.sum(value2=b, value1=a);
    
    /* the second argument of the m1 method will be the default value assigned in m1 method signature.  */
    val f = sumOjb.m1(10);

    val factorialValue = sumOjb factorial 4;

    println("Factorial Value :"+factorialValue );
    
  }

}