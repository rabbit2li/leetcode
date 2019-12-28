package com.hg.c05.fun

/**
  * @Author kim
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    println("ok---")

    def sayOk() = {
      println("main sayOk,,,")

      def sayOk() = {
        println("sayOk sayOk...")
      }

      sayOk()
    }

    sayOk()
  }

  def sayOk() = {
    println("sayOk")
  }
}
