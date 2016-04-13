package org.sunsys.handson.scala.implict.cast

/**
 * @author ravibabu.mathi
 */
object ImplictCastExample3 {

  /*
   * Implicit class can't be used for top level class. Hence implicit class can be inside other class or function
   */
  implicit class RangeMaker2(left: Int) {
    def -->(right: Int): Range = left to right
  }
  
  def main(args:Array[String]) {
    
    var d = 1 --> 10;
  }

  

}


