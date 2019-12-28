package com.hg.c02.datatype

/**
  * @Author kim
  */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    //    sum
    //    exception

    //    var num = 1.2
    //    var num1 = 1.7f
    //    num1 = num.toFloat
    //
    //    val str: String = "hello"
    //    println(str.charAt(str.length - 1))
    //    println(str.takeRight(1))
    //    println(str(0))
    //    println(str.take(1))

    val +++ = 12
    println(+++)

    val `true` = 1314
    println(`true`)

    val Int = 12
    println(Int)

  }

  def sum: Int = {
    println("nizhude")
    return 1
  }

  def exception: Nothing = {
    throw new Exception("throw exception")
  }

}
