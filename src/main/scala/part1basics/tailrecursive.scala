package part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object tailrecursive extends App {
  val numberToCheck = 17 // Replace 17 with the number you want to check for primality
  val stringlist = List("Hello", "Test", "!") // Replace 17 with the number you want to check for primality
  val result = concatenate(stringlist)
  val astring = "polo"
  println(result)
  println(fibonaccifunction(numberToCheck))

  if (isprime(numberToCheck)) {
    println(s"$numberToCheck is a prime number.")
  } else {
    println(s"$numberToCheck is not a prime number.")
  }

  //* Below code is for concatenate function using tail recursive *//
  def concatenate(stringlist: List[String]): String = {
    @tailrec
    def concatenatehelper(resstring: List[String], accumulator: String): String = {

      resstring match {
        case Nil => accumulator
        case head :: tail => concatenatehelper(tail, accumulator + head)

      }

    }
    concatenatehelper(stringlist, "")

  }
  //* creating another function within the object and parsing the variable from the object.
  //* this is to print the string n number of times

  def concatenatetail(astring:String, numberToCheck:Int, accumulator:String):String = {
  if (numberToCheck <= 0) accumulator
  else
      concatenatetail(astring,numberToCheck-1,astring+accumulator)
  }
  println(concatenatetail(astring,numberToCheck,""))

  //*Create another function that checks if the number is prime
  def isprime(numberToCheck : Int): Boolean = {
    if (numberToCheck <= 1) {
      false
    }
    else {
      @tailrec
        def isprimehelper(divisor: Int): Boolean ={
        if (divisor <=1) true
        else if (numberToCheck % divisor == 0) false
        else isprimehelper(divisor-1)
        }
        isprimehelper(numberToCheck/2)

    }

  }
  //*create fibonacci series
  def fibonaccifunction(numberToCheck:Int):Int ={
    def fibonaccihelper(n:Int, last:Int, lastbefore: Int):Int = {
      if (n >= numberToCheck)
        last
      else fibonaccihelper(n+1,last + lastbefore, last)
      }
    if (numberToCheck <= 2) 1
    else fibonaccihelper(3,1,1)
  }






}












