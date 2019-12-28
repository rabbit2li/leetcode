package com.hg.c06.oop

/**
  * @Author kim
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    var res: Long = 1
    //    for (i <- "Hello") {
    //      res *= i.toLong
    //    }
    //    println("res = " + res)

    "Hello".foreach(res *= _.toLong)
    println("res = " + res)

    println("pd = " + product("Hello"))

  }

  def product(s: String): Long = {
    if (s.length == 1)
      s.charAt(0).toLong
    else
      s.take(1).charAt(0).toLong * product(s.drop(1))
  }

}
