package com.hg.c06.oop

/**
  * @Author kim
  */
object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "jack"
    cat.age = 3
    cat.color = "white"
    println("ok...")
    println(cat.hobby)
    println(cat.addr)
  }
}

class Cat {
  var name: String = _ // 名字
  var age: Int = _ // 年龄
  var color: String = _ // 颜色
  var hobby = null
  var addr: String = null
}