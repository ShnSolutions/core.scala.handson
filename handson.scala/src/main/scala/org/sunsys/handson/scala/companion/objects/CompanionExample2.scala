package org.sunsys.handson.scala.companion.objects

/**
 * @author ravibabu.mathi
 */
class CompanionExample4 {
  
  def printHello() {
    println("message:  HELLO");
  }
}

object CompanionExample4 {
  def apply() = new CompanionExample4();
  
  def printHelloWorld() {
    println("message: Hello World");
  }
}


trait Animal {
  def speak
}

object Animal {
 
  private class Dog extends Animal {
    override def speak { println("woof") }
  }
   
  private class Cat extends Animal {
    override def speak { println("meow") }
  }
 
  // my preferred factory method  
  def apply(s: String): Animal = {
    if (s == "dog") return new Dog
    else return new Cat
  }
}