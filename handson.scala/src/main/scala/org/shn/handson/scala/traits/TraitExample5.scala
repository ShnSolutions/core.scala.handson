package org.shn.handson.scala.traits

import scala.collection.mutable.ArrayBuffer


abstract class IntQueue {
  def get():Int
  def put(element:Int)
}

class Example5_BaseIntQueue extends IntQueue {
  val queue = ArrayBuffer.empty[Int]

  def put(element:Int) {
    queue += element
  }
  def get():Int = {
    queue.remove(0)
  }
}

trait Double extends IntQueue {
  
  abstract override def put(x:Int) = super.put(x*2)
}

class MyQueue extends Example5_BaseIntQueue with Double 

object TraitExample5 {
  
  def main(args: Array[String]): Unit = {
    
    val queue = new Example5_BaseIntQueue with Double
    val myQueue = new MyQueue
    
    queue.put(10)
    println("element:"+queue.get())
    
    myQueue.put(20)
    println("element :"+myQueue.get())
  }
}