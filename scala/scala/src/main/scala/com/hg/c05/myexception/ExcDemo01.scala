package com.hg.c05.myexception

/**
  * @Author kim
  */
object ExcDemo01 {
  def main(args: Array[String]): Unit = {
    try {
      var i = 10 / 0
    } catch {
      case ex: ArithmeticException => println("算术异常...")
      case ex: Exception => println("捕获异常...")
    } finally {
      println("scala exception")
    }
  }
}
