package com.hg.c05.mylazy

/**
  * @Author kim
  */
object LazyDemo01 {
  def main(args: Array[String]): Unit = {
    lazy val res = sum(4, 5)
    println("print...")
    println("res = " + res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum()...")
    n1 + n2
  }
}
