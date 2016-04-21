package org.shn.handson.scala.traits

trait Example4_Msg1 {
  def printMsg = println("Example4_Msg1 - printMsg")
}

trait Example4_Msg2 {
  def printMsg = println("Example4_Msg2 - printMsg")
}

class Example4_MsgImpl extends Example4_Msg1 with Example4_Msg2  {
  
  override def printMsg = super.printMsg
}

object TraitExample4 {
  
}