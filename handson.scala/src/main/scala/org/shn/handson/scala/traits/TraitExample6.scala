package org.shn.handson.scala.traits

import scala.collection.mutable.ArrayBuffer

abstract class Example6_IntQueue {
  def get():Int
  def put(element:Int)
}

class Example6_BaseIntQueue extends Example6_IntQueue {
  val queue = ArrayBuffer.empty[Int]

  def put(element:Int) {
    queue += element
  }
  def get():Int = {
    queue.remove(0)
  }
}

trait Example6_Increment extends Example6_IntQueue {
  abstract override def put(ele:Int) { 
    println("Example6_Increment . put")
    super.put(ele + 1 )
  }
}

trait Example6_Filter extends Example6_IntQueue {
  abstract override def put(ele:Int) { 
    println("Example6_Filter . put")
    if (ele >= 0 )
    super.put(ele )
    else 
      println("element filtered ****")
  }
}

object TraitExample6 {
  
  def main(args: Array[String]): Unit = {
    
    val queue1 = (new Example6_BaseIntQueue with 
                      Example6_Increment with 
                      Example6_Filter)
                      
    
    queue1.put(-1) // first filter then increment 
    queue1.put(1)
//    queue1.put(5)
    println("execution order: filter + increment :"+queue1.get())
    
    val queue2 = (new Example6_BaseIntQueue with 
                      Example6_Filter with 
                      Example6_Increment )
    queue2.put(-1) // first increment then filter 
//    queue2.put(1)
//    queue2.put(5)
    println("execution order: increment  + filter :"+queue2.get())
    
  }
}