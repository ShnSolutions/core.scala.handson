package org.shn.handson.scala.control.structures.if_construct

object Example1 {

  def main(args: Array[String]): Unit = {

    val predicateResult = true;

    var value: Int = 0;

    if (predicateResult) {
      value = 10
    } else {
      value = 20
    }

    /* 	functional way of writing 
    		if statement results in a value.
    		"if" construct is an expression. 
    */
    var value2 = if (predicateResult) value + 10; else value + 20;

    // e.g.2
    val filename =
      if (!args.isEmpty) args(0); else "default.txt"
    
        
  }
}