package com.hg.c05.fun

/**
  * @Author kim
  */
object Test01 {
  def main(args: Array[String]): Unit = {
    println(febnacci(7))
    println(f(3))
    println(eat(10))
  }

  def febnacci(n1: Int): Int = {
    if (n1 == 1 || n1 == 2) {
      1
    } else {
      febnacci(n1 - 1) + febnacci(n1 - 2)
    }
  }

  def f(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  /**
    * eat(n) = 2 * (eat(n-1) + 1)
    *
    * @param n
    * @return
    */
  def eat(n: Int): Int = {
    if (n == 1) {
      1
    } else {
      2 * (eat(n - 1) + 1)
    }
  }
}
