package org.sunsys.handson.scala.named.arguments

/**
 * @author ravibabu.mathi
 */
class NamedArgumentsExample1(name:String, loginId:String) {
  
}


object NamedArgumentsExample1_Main {
  
  def main(args:Array[String]) {
    
    
    var obj1 = new NamedArgumentsExample1("Ravi", "12345");
    var obj2 = new NamedArgumentsExample1("123456", "Gokul");
    var obj3 = new NamedArgumentsExample1(loginId="12346", name="Kiran");
    var obj4 = new NamedArgumentsExample1("KV", loginId="123467" );
    
  }
}