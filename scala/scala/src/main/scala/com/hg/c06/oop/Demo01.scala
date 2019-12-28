package com.hg.c06.oop

/**
  * @Author kim
  */
object Demo01 {
  def main(args: Array[String]): Unit = {
    val test = new Test
    println(test.var1 + "___" + test.var5)
    println(test.var2)
    println(test.var3)
    println(test.var4)
    println(test.res)
  }
}

class Test {
  var var1: String = _ // null
  var var2: Int = _ // 0
  var var3: Float = _ // 0.0
  var var4: Boolean = _ // false
  var var5: Cat = _
  var res = {}
}
