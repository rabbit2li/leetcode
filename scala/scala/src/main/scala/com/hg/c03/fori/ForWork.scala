package com.hg.c03.fori

/**
  * @Author kim
  */
object ForWork {
  def main(args: Array[String]): Unit = {
    // for循环练习
    val start = 1
    val end = 100
    var count = 0
    var sum = 0
    for (i <- start to end) {
      if (i % 9 == 0) {
        count += 1
        sum += i
      }
    }
    printf("count=%d, sum=%d\n", count, sum)

    val n1 = 0
    val n2 = 6
    for (i <- n1 to n2) {
      println(i + " + " + (n2 - i) + " = " + n2)
    }
  }
}
