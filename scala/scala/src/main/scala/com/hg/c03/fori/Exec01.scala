package com.hg.c03.fori

import scala.io.StdIn

/**
  * @Author kim
  */
object Exec01 {
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0 // 分数
    var classScore = 0.0 // 班级总分数
    var totalScore = 0.0 // 总分数

    for (i <- 1 to classNum) {
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("第 %d 个班级的第 %d 个学生\n", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      printf("第%d个班级平均分为%.2f\n", i, classScore / 5)
      totalScore += classScore
    }
    printf("班级总平均分为%.2f", totalScore / 3)

  }
}
