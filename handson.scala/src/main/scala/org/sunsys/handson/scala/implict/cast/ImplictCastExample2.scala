package org.sunsys.handson.scala.implict.cast

/**
 * @author ravibabu.mathi
 */




class ImplictCastExample2 {

  class MyRangeMarker(left:Int) {
    def ==> (right:Int):Range = left to right;
  }

  implicit def myRange(left:Int):MyRangeMarker = new MyRangeMarker(left);
  
  def main(args:Array[String]) {
    
    val d:Range = ( 1 ==> 5);
    
  }
  
}

