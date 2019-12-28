package com.hg.c01

/**
  * @Author kim
  */
object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](10)
    for (item <- arr) {
      println("item: " + item)
    }
  }

}
