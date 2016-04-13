package org.shn.handson.scala.caseclasses

/**
 * @author ravibabu.mathi
 */



  /*
   * Note:
   * 
   * Case class not allowed with out parameters. 
   * In case if case class need not to have parameters as per the business requirements, 
   * it should be declared with empty parameters or should use case object instead of case class. 
   */
  

case class CaseClassExample1(var name:String) {

  /*
   * In case of "case class" in scala
   *  1.  compiler generates equals and hashCode, toString methods
   *  2.  compiler creates a companion object with appropriate "apply" method 
   *  3.  compiler also creates "unapply" method
   *  4.  ucompiler provides A default implementation of serialization
   */

  def getName():String = {
    return name;
  }
  
  
}


object CaseClassExample1_Main {
  
  def main(args:Array[String]) {
    
    var obj1:CaseClassExample1  = CaseClassExample1("test");
    var obj2:CaseClassExample1  = CaseClassExample1("test");
    obj1.name = "test2";
    
    println("Name:"+obj1.name);
    println("has code:"+obj1.hashCode());
    println("eqyals:"+obj1.equals(obj2));
    println("Name:"+obj1.toString());
    
    
  }
}