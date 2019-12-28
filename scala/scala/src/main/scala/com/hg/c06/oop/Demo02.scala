package com.hg.c06.oop

/**
  * @Author kim
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    println(1 to 10)
    for (i <- 1 to 10 reverse) {
      print(i + "\t")
    }
    countDown(6)
  }

  def countDown(n: Int): Unit = {
    (0 to n).reverse.foreach(print)
  }


}
