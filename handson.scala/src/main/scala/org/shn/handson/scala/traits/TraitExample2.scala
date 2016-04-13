package org.shn.handson.scala.traits

/**
 * @author ravibabu.mathi
 */

trait Trait_A {
    def print() { println("Trait_A");  }
}
 
trait Trait_B extends Trait_A {
    override def print() { println("Trait_B");  }
}
 
trait Trait_C extends Trait_A {
    override def print() { println("Trait_C"); }
}
 

/*
 * print method is overrided in Trait_B and Trait_C as well
 * If D class object calls the print method, 
 * it will call the from Trait_C since Trait_C is the right most trait which is included in inheritance
 */
class Class_D extends Trait_B with Trait_C {
}
 

object TraitExample2 extends App {
    (new Class_D).print()
}

