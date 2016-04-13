package org.shn.handson.scala.implict.cast

/**
 * @author ravibabu.mathi
 */
object ImplictCastExample1 {
  
  
  implicit def double2Int(d:Double):Int = d.toInt 
  
  def main(args:Array[String]) {
    
    var d : Int = 2.3;

    var oneTo10 = 1 to 10;
    
    println(oneTo10)
    
  }
}

