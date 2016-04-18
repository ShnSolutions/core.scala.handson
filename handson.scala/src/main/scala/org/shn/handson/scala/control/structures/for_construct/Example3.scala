package org.shn.handson.scala.control.structures.for_construct

object Example3 {
  
  def main(args: Array[String]): Unit = {
    
    val files = (new java.io.File(".")).listFiles    
    
    for( file <- files; if file.isFile() ) {
      println("File:"+file)
    }
    
    for( file <- files; if file.isFile(); if file.getName.endsWith(".xml") ) {
      println("xml File:"+file)
    }

  }
}