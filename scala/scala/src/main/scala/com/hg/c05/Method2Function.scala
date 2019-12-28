package com.hg.c05

/**
  * @Author kim
  */
object Method2Function {
  def main(args: Array[String]): Unit = {
    val num = new Num
    val sum = num.sum(2, 3)
    println("sum = " + sum)

    // 方法转函数
    val f1 = num.sum _
    println("f1 = " + f1(4, 5))

    // 定义函数
    val f2 = (n1: Int, n2: Int) => n1 + n2
    println("f2 = " + f2(7, 8))
  }
}

class Num {
  // 方法
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}