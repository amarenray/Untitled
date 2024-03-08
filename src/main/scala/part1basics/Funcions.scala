package part1basics

object Funcions extends App {

  def afunct(a:String ,b:Int):String = {
      a+ " " +b
  }
  println(afunct("Test",3))

  def simplefunction(): Int = 30
  println(simplefunction())
  println(simplefunction)

  //Below function is a loop and is suggested in Scala.
  def loopfunction(x:String,y:Int): String ={

    if (y == 1)
          x
    else {
      //everytime the function is called in loop until y = 1
      x+loopfunction(x,y-1)
    }
  }
  println(loopfunction("loop", 3))

  //Greetings function.

  def greetfunction(aname:String,anage:Int): String = {

    "Hi my name is " + aname +" and my age is " + anage
  }
  println(greetfunction("Amar",42))

//Factorial function

  def factorialfunction(n:Int) :BigInt ={
    if (n == 0 || n == 1)
      1
    else
      n * factorialfunction(n-1)
  }

  println("the factorial of the number is " + factorialfunction(4))

  //Fibonacci function

  def fibonaccifunction(n:Int) :BigInt ={
    if (n <= 1)
      n
    else
      fibonaccifunction(n-1) + fibonaccifunction(n-2)
  }


    for (i <- 0 until 10)
      {
        println(fibonaccifunction(i))
      }

  def isPrime(n:Int):Boolean = {
    if (n <= 1)
      {
        false
      }
    else {
      var numprime = true
      for (i<-2 until n/2)
      {
        if (n % i ==0) {
          numprime = false
        }
      }
      numprime
    }
  }

    println(isPrime(8))
    println(isPrime(37))
    println(isPrime(73))
    println(isPrime(33*67))
}
