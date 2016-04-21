package org.shn.handson.scala.traits

/**
 * @author ravibabu.mathi
 */
trait TraitExample1 {
   /*
    * Trait can not have parameterized constructor
    */
  /*
   * Traits can define fields and maintain state.
   */
  /*
   * In fact you can do any thing in trait definition 
   * that you can do in class definition, exception two things
   * 
   * 1.	Can't create an instance
   * 2.	can't have parameterized constructor (for primary constructor)
   */
  /*
   * One more difference between class and trait, 
   * in class, super calls are statically bound, 
   * in trait they are dynamically bound
   */
   /*
    * In Traits, can define members (in java terminology instance variables)
    * unlike java, either var  or val can be defined in Trait
    */
   private var balance : Int = 0; 
   
   /*
    * In case, if var is defined inside the Trait, it can be modified
    */
   def updateBalacnce(balance:Int) {
     this.balance = balance;
   }
   
   /*
    * Trait in scala are similar to java in terms of abstract methods. 
    * Trait can have abstract methods
    *  
    * The following method is an abstract method, hence it has to be implemented in the inherited class
    */
   def isNumeric(str:String): Boolean;
   
   /*
    * Trait can also have concrete methods, 
    * hence inherited class need not to implement (inherited class can override)
    */
   def isLength15(str:String):Boolean = { return str.length()==15; }
   
}