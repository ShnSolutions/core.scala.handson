package org.sunsys.handson.scala.named.arguments

/**
 * @author ravibabu.mathi
 */
class NamedArgumentsExample2 {
  
  def printMsg(name:String, year:String) {
    println("name:"+name+"\tbirth year:"+year);
  }
}

class NamedArgumentsExample_SubClass extends NamedArgumentsExample2 {
  
  override def printMsg(name:String, birthYear:String){
    println("name:"+name+"\tbirth year:"+birthYear);
  }
}

object NamedArgumentsExample_Main {
  
  def main(args:Array[String]) {
    
    var obj1: NamedArgumentsExample_SubClass = new NamedArgumentsExample_SubClass();
    obj1.printMsg(name="Ravi", birthYear="1984")
    //obj1.printMsg(name="Ravi", year="1984")    
    

    var obj2: NamedArgumentsExample2 = new NamedArgumentsExample_SubClass();
    obj2.printMsg(name="Ravi", year="1234");
//    obj2.printMsg(name="Ravi", birthYear="1234");
  
  }
}