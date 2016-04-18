package org.shn.handson.scala.control.structures.while_construct

object Example1 {
  
  def main(args: Array[String]): Unit = {
    
    var i = 0;
    
    while (i < 10) {
      println("i value:"+i)
      i = i + 1;
    }
    
    i = 0
    /* result holds Unit. 
     * while and do...while constructs are called "loops", 
     * not expressions
     * */
    val result = while (i < 10) {
      println("i value:"+i)
      i = i + 1;
    }
    
    /* 
     * The existence of "()" is 
     * how Scala’s Unit differs from Java’s void
     * */
    if( result == () ) {
      println(" unit can be compared uinsg \"()\" ")
    }

    /*
     * One other construct that results in the unit value, 
     * which is relevant here, is reassignment to vars. 
     * For example, were you to attempt to read lines in 
     * Scala using the following while loop idiom
     *      
     */

    var line = ""
    while ((line = readLine()) != "") // This doesn’t work!
      println("Read: " + line)
      
    // read the warning message for the above while loop  
      
  }
}