package org.sunsys.handson.scala.companion.objects

/**
 * @author ravibabu.mathi
 */
class CompanionExample1 {
  
}


/*
 * When a singleton object is named the same as a class, it is called a companion object
 * 
 * In Scala companion object should be created in the same source file in which Class is created.
 * In case if we try to create companion object in other file, scala gives compilation error
 * 
 * 
 */
object CompanionExample1 {
}

object Test {
  
  def main(args:Array[String]) {
    var obj1 = new CompanionExample1();
    var obj2 = new CompanionExample1();

  }
}