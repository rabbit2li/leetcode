package com.hg.c06.method

/**
  * @Author kim
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val demo = new Demo01
    demo.printRect()

    demo.len = 2.6
    demo.width = 6.2
    println("area = " + demo.area())
  }
}

class Demo01 {

  var len = 0.0
  var width = 0.0

  def printRect(): Unit = {
    for (i <- 1 to 10) {
      for (j <- 1 to 8) {
        print("*")
      }
      println()
    }
  }

  def area(): Double = {
    (this.len * this.width).formatted("%.2f").toDouble
  }
}
