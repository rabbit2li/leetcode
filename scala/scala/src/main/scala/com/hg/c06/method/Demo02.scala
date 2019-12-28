package com.hg.c06.method

/**
  * @Author kim
  */
object Demo02 {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.say()
  }
}

class Dog {

  val name = "jack"
  val age = 6
  val weight = 8.8

  def say(): Unit = {
    println("name = " + name + ", age = " + age + ", weight = " + weight)
  }
}
