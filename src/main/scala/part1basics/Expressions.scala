package part1basics

object Expressions extends App {

  val x = 1 + 2
  println (x)

  println (1 >> x)
// ! is for negation, linke != , ==, >>, <<
  val cond = if (1 == x) println("inside if") else println("i am in else")
  println(cond)
//now for the above code the expression () is printed, this is a sideeffect of expression
  val conds = if (1 != x) println("i am excited") else 0
  println(conds)

  println(if (1+2 == 3) "i am testing" else " expression learn")

  println(if(2 > 3) "i understood" else " your call")

  val acodeblock = {
    val x = 2
    val y = x + 1

    if (y > x) "mark the expression" else "dont bother"
  }
  println(acodeblock)

  println()
}
