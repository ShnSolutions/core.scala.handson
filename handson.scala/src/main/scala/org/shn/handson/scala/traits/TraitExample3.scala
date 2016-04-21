package org.shn.handson.scala.traits


trait Example3_Msg1 {
  def printMsg =  println("Msg1 - printMsg")
}

trait Example3_Msg2 extends Example3_Msg1 {
 
  override def printMsg =  println("Msg2 - printMsg")
}

class MsgImpl extends Example3_Msg2 {
  
}

object TraitExample3 {
  
  def main(args: Array[String]): Unit = {
    val msg2 = new MsgImpl
    msg2.printMsg
  }
}

