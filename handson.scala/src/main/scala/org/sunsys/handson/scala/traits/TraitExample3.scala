package org.sunsys.handson.scala.traits

/**
 * @author ravibabu.mathi
 */

trait Base1 {
    def print() { println("Base1");  }
}
 
trait A extends Base1 {
    override def print() { println("A"); super.print() }
}
 
trait B extends Base1 {
    override def print() { println("B"); super.print() }
}
 
class Base2 {
    def print() { println("Base2") }
    def print2() { println("print2 of Base2") }
}
 
class C extends Base2 with A with B {
    override def print() { println("C"); super.print() }
}
 


object Main extends App {
    (new C).print()
    var c1 = new C();
    
}



