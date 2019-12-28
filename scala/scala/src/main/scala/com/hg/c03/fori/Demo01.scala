package com.hg.c03.fori

/**
  * @Author kim
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 5
    for (i <- start until end if i != 2) {
      println("你住的，巷子里。" + i)
    }
  }
}
