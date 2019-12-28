package com.hg.c05

import scala.io.StdIn

/**
  * @Author kim
  */
object Exec01 {
  def main(args: Array[String]): Unit = {
    println("99乘法表...")
    while (true) {
      val n = StdIn.readInt()
      print99(n)
    }
  }

  def print99(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d = %d\t", j, i, i * j)
      }
      println()
    }
  }

}
