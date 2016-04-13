package org.sunsys.handson.scala.pattern.matching

/**
 * @author ravibabu.mathi
 */
object TypePatternMatchExample {
  
  def matchTesting(x:Any):String = {
    
    println("type:"+ x.getClass().getName())
    
    
    x match {
      case Int => return x.getClass().getName();
      case x: Int => return x.getClass().getName();
      case Float => return x.getClass().getName();
      case Double => return x.getClass().getName();
//      case java.lang.Integer => return x.getClass().getName();             // this line gives compilation error why ?
      case _ => return x.getClass().getName();
    }
    
    return null;
  }
  
  
  def main(args: Array[String]): Unit = {
    
    var x:Int = 1;
    print("data type:"+ matchTesting(x));
    
  }
}