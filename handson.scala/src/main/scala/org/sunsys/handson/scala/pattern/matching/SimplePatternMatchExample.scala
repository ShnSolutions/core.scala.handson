package org.sunsys.handson.scala.pattern.matching

/**
 * @author ravibabu.mathi
 */
object SimplePatternMatchExample {
 
   def matchingTest( x: Int ): String = {
   
     x match {
       case 1 => return "one";
       case 2 => return "two"
       case _ => return "other"
     }
     
     return ""
   }
  
   def main(args: Array[String]): Unit = {
     
     val x:Int = 1;
     
     println( " value:"+ matchingTest(x));
   } 
   
   
}