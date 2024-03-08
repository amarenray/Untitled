package part1basics

object values extends App {
  //vals are immutable
  val x: Int = 10
  println (x)
  // another way of declaring variables
  val y = 15
  println (y)
  //val using strings
  val str: String = "hello";val strg: String = "guys";

  val bool: Boolean = true
  println(bool)
  val anint: Int = 4
  println(anint)
  val shrt: Short = 777
  println(shrt)
  val flt: Float = 2.66f
  println(flt)
  val dble: Double = 3.44
  println(dble)

  //the below are Var, vars are mutable.
  var vrble: Int = 5
  vrble = 6
  println(vrble)
  vrble += 1
  println(vrble)

}
