package com.hg.c03.fori

/**
  * @Author kim
  */
object StepFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println("i = " + i)
    }

    // 控制步长
    for (i <- Range(1, 10, 2)) {
      println("i = " + i)
    }

    // 控制步长
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i = " + i)
    }

  }
}
