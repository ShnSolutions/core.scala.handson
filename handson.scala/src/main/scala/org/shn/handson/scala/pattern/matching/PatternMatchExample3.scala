package org.shn.handson.scala.pattern.matching

/**
 * @author ravibabu.mathi
 */
object PatternMatchExample3 {
  
  
  def matchTesting(x:Int) {
  
    x match {
      case 1 | 4 => println("case-1")
      case 12 => println("case-2")
      case x if x>13 && x < 50 => println("case-3")
      case x if x%7 == 0 => println("case-4")
      case _ => println("default case")
    }
    
    
  }
  
  def main(args: Array[String]): Unit = {
    
    matchTesting(1);
    matchTesting(2);
    matchTesting(2);
    matchTesting(4);
    matchTesting(7);
    matchTesting(14);
    matchTesting(21);
    matchTesting(63);
  }
}