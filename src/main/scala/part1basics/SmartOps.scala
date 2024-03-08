package part1basics

object SmartOps extends App{

  val astring:String = "Hello i am on smart ops"

  //** the below are Java functions
  println(astring.charAt(4))
  println(astring.substring(7,11))
  println(astring.split(" ").toList)
  println(astring.startsWith("Hello")) //* the output is a true or false to check if the string start with the argument
  println(astring.startsWith("on",11)) //* this is to check if the string at that particular offset.
  println(astring.replace(" "," - "))
  println(astring.replace(" "," - ").toLowerCase)
  println(astring.replace(" "," - ").toList)
  println(astring.toUpperCase)
  println(astring.toCharArray)
  println(astring.charAt(8))
  println(astring.compareTo("Hell"))//*string presence give a positive outcome
  println(astring.compareTo("Hello i am on smart ops")) //*string exact match returns 0
  println(astring.compareTo("amar")) //* string that does not match gives negative result
  println(astring.length)

  //*scala specific functions
  val numstring = "12345567"
  val numbers = numstring.toInt

  println(numbers)
  println('a' +: numstring :+ 'b')
  println("a" +: numstring :+ "z")
  println(numstring.reverse)
  println(numstring.take(2)) //* kind of substring

  //* Scala interpolators
  //*s-Interpolators
  val aname = "jithu"
  val bname = "Sarvu"
  val age = 12
  val brothers = s"my $bname is $aname"
  val myage = s"i am $aname and my age is $age "

  println(myage)
  println(brothers)
  //*f interpolators

  val speed = 1.2f
  val display = f"$aname can write at speed $speed%2.2f "
  println (display)

  //* raw interpolators
  println(raw"test the new line \n for fun")
  val newline = "test the new line \n for fun"
  println(raw"$newline")











}
