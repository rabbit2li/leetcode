package com.hg.c05.fun

/**
  * @Author kim
  */
object FunDemo01 {
  def main(args: Array[String]): Unit = {
    println("res = " + getRes(4, 5, '/'))
    test(4)
  }

  def getRes(n1: Int, n2: Int, oper: Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null
    }
  }

  def test(n: Int) {
    if (n > 2) {
      test(n - 1)
    }
    println("n = " + n)
  }

}
