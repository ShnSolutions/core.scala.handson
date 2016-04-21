package org.shn.handson.scala.traits


trait Msg {
  /*
   * trait is more like interface in java.
   * trait Instance can't be created.
   * 
   * since this trait is not extending any other class or trair, 
   * super calss for this trair is AnyRef
   * 
   * instance if trait is nothing but instance of Concreate class which extended the trait
   * 
   * method of Traits can be accessed using trait's instance
   */
	def printMsg = println("TraitExample2 - Trait printMsg method")
	
	/*
	 * printMsg2 - is an abstract method
	 */
	def printMsg2
	
}

class Msg1 extends Msg {
  
  override def printMsg2 = println("Msg1 - printMsg2 method ")
}

/*
class Msg2 with Msg {		// will get compilation error
}

*/
object TraitExample2 {

  def main(args: Array[String]): Unit = {
    val msg1 = new Msg1()
    msg1.printMsg
  }
}

