package com.hg.c03.mybreak

import util.control.Breaks._

/**
  * @Author kim
  */
object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1
    breakable {
      while (n < 20) {
        n += 1
        if (n >= 18) {
          // 中断while
          // 在scala中使用函数式的break函数中断循环
          break()
        }
      }
    }
    println("n = " + n)
  }
}
