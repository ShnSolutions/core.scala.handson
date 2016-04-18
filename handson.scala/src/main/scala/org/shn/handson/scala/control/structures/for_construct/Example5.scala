package org.shn.handson.scala.control.structures.for_construct

import java.io.File

object Example5 {
  
  def main(args: Array[String]): Unit = {
    
    val files = (new java.io.File(".")).listFiles    
    def getLines(file:File) = scala.io.Source.fromFile(file).getLines()
    
    for {
      file <-  files
      if file.isFile()
      if file.getName.endsWith(".xml")
      
      line <- getLines(file)
      words = line.split(" ")
      if words.length > 0
    } println ("file:"+file+ "\t\t words:"+words.mkString("|") )
    
  }
}