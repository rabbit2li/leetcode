package com.hg.c05.fun

/**
  * @Author kim
  */
object Demo04 {
  def main(args: Array[String]): Unit = {
    println(sum(10, 20, 30, 40))
    println(f1)
  }

  def sum(n1: Int, args: Int*): Int = {
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }

  def f1 = "kim"
}
