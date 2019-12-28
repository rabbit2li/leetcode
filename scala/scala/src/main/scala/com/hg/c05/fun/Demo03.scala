package com.hg.c05.fun

/**
  * @Author kim
  */
object Demo03 {
  def main(args: Array[String]): Unit = {
    println(sayHi("kim"))
  }

  def sayHi(name: String = "jack") = {
    "hello " + name
  }
}
