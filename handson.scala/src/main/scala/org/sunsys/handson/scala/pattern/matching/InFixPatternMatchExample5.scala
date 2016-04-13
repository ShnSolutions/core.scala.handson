package org.sunsys.handson.scala.pattern.matching

/**
 * @author ravibabu.mathi
 */
object InFixPatternMatchExample5 {
  
  def matchTesting[T](l1 : List[T]) {
    
    l1 match {
      
      case i1::i2::i3::i4::rest => println(List(i2,i4));
      case _ => print("else");
    }
  }
  
  def main(args: Array[String]): Unit = {
    
    
    matchTesting(List(1,2,3,4,5,6,7,8));
    matchTesting(List(1,2));
  }
}