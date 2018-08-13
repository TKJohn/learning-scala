package net.tkjohn

import java.util.Date

object HelloWorld {

  def m(x: Int): Int = x + 3

  val f: Int => Int = (x: Int) => x + 3

  def main(args: Array[String]): Unit = {
    val date = new Date
    val logWithDateBound = log(date, _: String, _: String)

    val pa = (40, "Foo")
    println("Hello world")

    println(pa)
    println(m(3))
    println(f(3))

    println(f.getClass)
    println(m(1).getClass)
    logWithDateBound("TEST", "TEST2")
  }

  def log(date: Date, message: String, message2: String): Unit = {
    var date = new Date
    date = new Date
    var y: Option[Date] = Some(new Date)
    y=Some(null)
    println(date + "---" + message + "---" + message2)

    println(y.getOrElse("err"))
  }
}
