package com.hg.c02.inputcon

import scala.io.StdIn

/**
  * @Author kim
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    //    Kum.kim(4, 7)
    println("请输入姓名：")
    val name = StdIn.readLine()
    println("请输入年龄：")
    val age = StdIn.readInt()
    println("请输入薪水：")
    val sal = StdIn.readDouble()

    printf("输出信息为：name=%s age=%d sal=%f", name, age, sal)
  }
}

//object Kum {
//  private var n1 = 12
//
//  def kim(a: Int, b: Int): Unit = {
//    println(a + b)
//  }
//}
