package part1basics

object default_names extends App{

  def hellofunction(name: String = "Amar", age: Int = 42, hobby:String ="learn"):String =
    s"Hi i am $name and my age is $age and i love $hobby"
//* this function is to call function that has the default values and
  println(hellofunction(hobby="Cooking"))
}
