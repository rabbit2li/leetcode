package com.hg.c02.ifelse

import scala.io.StdIn

/**
  * @Author kim
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入年龄：")
    val age = StdIn.readInt()
    if (age > 18) {
      println("成年了...")
    } else {
      println("未成年...")
    }
  }
}
