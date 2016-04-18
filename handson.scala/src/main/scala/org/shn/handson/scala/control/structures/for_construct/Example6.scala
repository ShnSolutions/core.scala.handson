package org.shn.handson.scala.control.structures.for_construct

object Example6 {
  
  def main(args: Array[String]): Unit = {
    
    val files = (new java.io.File(".")).listFiles

    val xmlFiles = for {
      file <- files;
      if file.isFile();
      if file.getName.endsWith(".xml")
    } yield file
    
    println("xml files:"+xmlFiles.mkString(","))

    val xmlFiels2 = for (file <- files;
                if file.isFile();
                if file.getName.endsWith(".xml")
                ) yield file
    println("xml files2:"+xmlFiels2.mkString(","))
 
  }
}