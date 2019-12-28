package com.hg.c02.ifelse

import scala.io.StdIn

/**
  * @Author kim
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    while (true) {
      println("考试成绩为：")
      val grade = StdIn.readInt()
      if (grade == 100)
        println("BMW一辆...")
      else if (grade > 80 && grade <= 99)
        println("iphone7plus一台...")
      else if (grade >= 60 && grade <= 80)
        println("iPad一个...")
      else
        println("nothing...")
    }
  }
}
