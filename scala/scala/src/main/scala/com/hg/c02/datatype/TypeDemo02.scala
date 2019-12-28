package com.hg.c02.datatype

/**
  * @Author kim
  */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    //    val huashi = 232.5
    //    val sheshi = 5.0 / 9 * (huashi - 100)
    //    println("摄氏温度为：" + sheshi.formatted("%.2f"))
    var num1 = -12
    num1 >>= 2
    println(num1)

    var a = 4
    var b = 5
    a = a ^ b
    b = a ^ b
    a = a ^ b
    println("a = " + a + ", b = " + b)

    var num2 = if (a < b) 100 else 199
    println(num2)
  }
}
