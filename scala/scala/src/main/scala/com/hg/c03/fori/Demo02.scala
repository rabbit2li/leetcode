package com.hg.c03.fori

/**
  * @Author kim
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j = 4 - i) {
      println("j = " + j)
    }

    for (i <- 1 to 3; j <- 1 to 3) {
      println("i = " + i + ", j = " + j)
    }

    for {
      i <- 1 to 3
      j <- 1 to 3
    } {
      println("i = " + i + ", j = " + j)
    }

    val res = for (i <- 1 to 3) yield {
      if (i == 2) {
        "你住的"
      } else {
        "巷子里"
      }
    }
    println(res)
  }

}
