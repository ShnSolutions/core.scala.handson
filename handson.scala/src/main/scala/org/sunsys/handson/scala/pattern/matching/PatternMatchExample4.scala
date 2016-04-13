package org.sunsys.handson.scala.pattern.matching

/**
 * @author ravibabu.mathi
 */
object PatternMatchExample4 {
  
  def matchTesting(x:Any) {
    
    x match {
      case x: List[Int] => print("case -1");
      case t: Int =>  println("int");
      case s: java.lang.String => print("case-3");
      case _ =>  println("else");
    }
  }
  
  def main(args: Array[String]): Unit = {
    val x:Int = 5;
    val l1 : List[Int] = List(1,2,3,4,5);
//    matchTesting(x);
  }
  
}