package org.shn.handson.scala.exceptions

/**
 * @author ravibabu.mathi
 */
object ExceptionHandlingExample1 {
  
  /*
   * Scala Doesn't have checked exceptions
   * only one catch block is allowed in scala. Inside catch block you can use pattern matching ("case" statement) 
   *    to handle multiple exception
   * 
   * Same as in java, finally block get executed even if exception arrigges in try block or not
   * 
   * java.lang.Throwable is the top level class in exception hirarrichy 
   */
  
  
  def exceptionHandlingTesting(x: Int) {
    
    
    try {
      if(x==1){
    	  throw new RuntimeException("User raised runtime exception")
      } else {
        
        throw new Exception("user raised Exception");
      }
    } catch {
      
      case e : RuntimeException => println("case-2"); e.printStackTrace();
      case e: Exception => println("case-1"); e.printStackTrace();
      case _ => println("sone other exception");
    }finally {
      /*
       * Same as in java, finally block get executed even if exception arrigges in try block or not
       */
      println("finally block")
    }
    
  }
  
  def main(args: Array[String]): Unit = {

    exceptionHandlingTesting(1);
    
    exceptionHandlingTesting(2);

  }
}