package org.shn.handson.scala.control.structures.for_construct

import java.io.File

object Example4 {
  
  def main(args: Array[String]): Unit = {
    
    val files = (new java.io.File(".")).listFiles    
    
    def getLines(file:File) = scala.io.Source.fromFile(file).getLines()
    
    for( 
        file <- files; 
        if file.isFile();
        if file.getName.endsWith(".xml");
        
        line <- getLines(file);
        if line.length() >0 
        ) { 
      println("file:"+file +"\t\t line:"+line)
    }
          
  }
}