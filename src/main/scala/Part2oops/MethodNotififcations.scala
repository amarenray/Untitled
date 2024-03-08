package Part2oops

object MethodNotififcations extends App {

  class Personal(val name: String, val favmovie:String){
    def likes(movie:String):Boolean = movie == favmovie
    def hangout(person:Personal): String = s"$this.name is hanging out with $person.name"
    def +(person:Personal): String = {
      s"$this.$name is hanging out with $person.$name)"
    }

  }

  val rec1 = new Personal("amar", "Aditya369")
  println(rec1 likes "Aditya369")
  println(rec1.likes("Aditya369"))

  val rec2 = new Personal("amar2", "sammohanam")
  println(rec1 hangout  rec2)

  val rec3 = new Personal("amar3", "sammohan3")
  println(rec1 +  rec3)
}
