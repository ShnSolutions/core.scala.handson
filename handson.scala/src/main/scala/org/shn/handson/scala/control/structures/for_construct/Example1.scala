package org.shn.handson.scala.control.structures.for_construct

object Example1 {
  
  def main(args: Array[String]): Unit = {
    
    val folderPath = "."
    
    val files = new java.io.File(folderPath).listFiles()
    
    /* 
     * .	file data type will be inferred based on "files" 
     * 		variable's data type
     * .	in for expression right side to <- can be any collection, 
     * 		not just array
    */
    for( file <- files)
      println(file)
      
  }
  
}