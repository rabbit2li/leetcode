package com.hg.c01

/**
  * @Author kim
  */
object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = "scala"
    println(str1 + str2)
    var name: String = "kim"
    var age: Int = 18
    var sal: Double = 13000.6789000
    // 格式化输出
    printf("姓名: %s\t年龄: %d\t薪资: %.2f\n", name, age, sal)

    // 使用$进行引用
    println(s"姓名: $name\n年龄: $age\n薪资: $sal")
  }
}
