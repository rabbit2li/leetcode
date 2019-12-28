package com.hg.c05.myexception

/**
  * @Author kim
  */
object ThrowComment {
  def main(args: Array[String]): Unit = {
    f1()
  }

  // 注释 (该方法会抛出某个异常)
  @throws(classOf[NumberFormatException])
  def f1() = {
    "abc".toInt
  }
}
