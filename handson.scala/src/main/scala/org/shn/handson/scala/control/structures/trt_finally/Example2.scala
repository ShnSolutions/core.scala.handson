package org.shn.handson.scala.control.structures.trt_finally

object Example2 {

  def main(args: Array[String]): Unit = {

    /*
     * if a finally clause includes an explicit return 
     * statement, or throws an exception, that return value 
     * or exception will “overrule” any previous one 
     * that originated in the try block or one of its catch 
     * clauses
     */
    
    def m1:Int = {
      try {
        return 1
      } catch {
        case _ => return 2
      } finally {
        return 3
      }
    }

    val value = m1 
    println("try..catch...finally expression result :" + value)

  }
}