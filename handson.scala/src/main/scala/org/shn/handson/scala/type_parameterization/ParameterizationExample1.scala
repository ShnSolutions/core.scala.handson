package org.shn.handson.scala.type_parameterization

/**
 * @author ravibabu.mathi
 */
object ParameterizationExample1 {
  
  def main(args:Array[String]) {
    
    /*
     * Scala uses the minus sign (-) to denote contravariance and the plus sign (+) for covariance
     */
    
    /*
     * In Scala, an immutable List is covariant in its type parameter, so List[String] is a
     * subtype of List[Any]. You can take an instance, List[String], and assign it to a List
     * of Any
     */
    var obj1 : List[String] = List("one", "two", "three");
    var obj2 : List[Any] = null;
    
    obj2 = obj1;
    
    var obj3 = 1 :: obj1;

    println("obj3 is:"+obj3)
    
    
    
  }
}