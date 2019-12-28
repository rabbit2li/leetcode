package com.hg.c03.homework

import util.control.Breaks._

/**
  * @Author kim
  */
object HomeWork01 {
  def main(args: Array[String]): Unit = {
    var sum = 0
    breakable {
      for (i <- 1 to 100) {
        sum += i
        if (sum > 20) {
          println("i = " + i)
          break()
        }
      }
    }

    println("==================")

    var sum2 = 0
    var flag = true
    for (i <- 1 to 100 if flag) {
      sum2 += i
      if (sum2 > 20) {
        println("i = " + i)
        flag = false
      }
    }
  }
}
