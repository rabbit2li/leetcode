package com.hg.c02.ifelse

import scala.io.StdIn

/**
  * @Author kim
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    println("请输入月份：")
    val month = StdIn.readInt()
    println("请输入年龄：")
    val age = StdIn.readInt()
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        println("60元")
      } else if (age < 18) {
        println("半价")
      } else {
        println("三分之一价")
      }
    } else {
      if (age > 18) {
        println("40元")
      } else {
        println("20元")
      }
    }
  }
}
