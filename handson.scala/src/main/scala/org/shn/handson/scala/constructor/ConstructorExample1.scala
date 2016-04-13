package org.shn.handson.scala.constructor

/**
 * @author ravibabu.mathi
 */

class ConstructorExample1( private var name:String, var _dateOfBirth:String, higherQualification:String){
  
//  default constructor
  def this() =  { 
    
		  this("","","");
  }

  // parameterized constructor
  def this(name:String)   { 
      this(name,"","");
  }
}

object ConstructorExample1_Main {
  
  def main(args: Array[String]): Unit = {
    
    var a1:Array[Int] = new Array[Int](10);
    
    var obj1:ConstructorExample1  = new ConstructorExample1("", "", "");
    var obj2:ConstructorExample1  = new ConstructorExample1();
//    var obj3:ConstructorExample1  = new ConstructorExample1("kv");

    
  }
}

