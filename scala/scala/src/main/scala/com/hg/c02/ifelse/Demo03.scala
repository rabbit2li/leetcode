package com.hg.c02.ifelse

/**
  * @Author kim
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 100
    val c = 6
    val m = b * b - 4 * a * c
    var x1 = 0.0
    var x2 = 0.0
    if (m > 0) {
      x1 = (-b + math.sqrt(m)) / (2 * a)
      x2 = (-b - math.sqrt(m)) / (2 * a)
      println("x1: " + x1 + ", x2: " + x2)
    } else if (m == 0) {
      x1 = (-b + math.sqrt(m)) / (2 * a)
      println("x1: " + x1)
    } else {
      println("无解...")
    }
  }

}
