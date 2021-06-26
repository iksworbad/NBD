import scala.annotation.tailrec

object NBD1 {

  def main(args: Array[String]): Unit = {
    println("Zad 1A")
    println(zad1a())
    println("Zad 1B")
    println(zad1b())
    println("Zad 1C")
    println(zad1c())
    println("Zad 2A")
    println(zad2a())
    println("Zad 2B")
    println(zad2b())
    println("Zad 3")
    println(zad3())
    println("Zad 4a")
    println(zad4a())
    println("Zad 4b")
    println(zad4b())
    println("Zad 4c")
    println(zad4c())
    println("Zad 5")
    println(zad5())
    println("Zad 6")
    println(zad6())
    println("Zad 7")
    println(zad6())
    println("Zad 8")
    println(zad8(List(0,0,0,0,1,0,2,0,3,4,0,0,0)))
    println("Zad 9")
    println(zad9(List(9,8,7,6,5,4,3,2,1)))
    println("Zad 10")
    println(zad10(List(-10, 10, 0, 3, -2, 13, -5)))
  }

  val weekdays = Array("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def zad1a(): String = {
    var result = ""

    for ((weekday, idx) <- weekdays.zipWithIndex) {
      if (idx != 0)
        result += ',' + weekday
      else
        result += weekday
    }
    result
  }

  def zad1b(): String = {
        var result = ""

    for ((weekday, idx) <- weekdays.zipWithIndex) {
      if(weekday.take(1) == "P") {
        if (idx != 0)
          result += ',' + weekday
        else
          result += weekday
      }
    }
    result
  }

  def zad1c(): String = {
    var result = ""
    val size = weekdays.length
    var i = 0
    while (i < size) {
      if (i != 0)
        result += ',' + weekdays(i)
      else
        result += weekdays(i)
      i += 1
    }
    result
  }

  def zad2a(weekdays: Array[String]=weekdays): String = {
    if (weekdays.length == 1)
      weekdays(0)
    else
      zad2a(weekdays.take(weekdays.length-1)) + ',' + weekdays.last
  }

  def zad2b(weekdays: Array[String] = weekdays): String = {
    if (weekdays.length == 1)
      weekdays(0)
    else
      weekdays.last + ',' + zad2b(weekdays.take(weekdays.length-1))
  }

  @tailrec
  def zad3(weekdays: Array[String]=weekdays, res: String = ""): String = {
    if (weekdays.length == 1)  res + weekdays(0)
    else zad3(weekdays.slice(1, weekdays.length), res  + weekdays(0)+ ",")
  }

  def zad4a(): String = {
    return weekdays.foldLeft("")((a:String,b:String) =>
      if (a == "") b
      else a + "," + b
    )
  }

  def zad4b(): String = {
    return weekdays.foldRight("")((a:String,b:String) =>
      if (b == "") a
      else a + ',' + b
    )
  }

  def zad4c(): String = {
    return weekdays.foldLeft("")((a:String,b:String) =>
      if (a == "") b
      else if(b.startsWith("P")) a + "," + b
      else a
    )
  }

  val products = Map("woda"->1d, "cola"->2d, "sok"-> 3d, "kawa"-> 4d)

  def zad5(): Map[String, Double] = {
    return  products map {case (k,v) =>(k, 0.9 * v)}
  }

  def zad6(args:(Int, Double, Float)= (1, 2d, 3f)) = {
    var (first, second, third) = args
    println(first)
    println(second)
    println(third)
  }

  def safeMap(key: Option[Int]) = key match
  {
    case Some(k) => (k)
    case None => (404)
  }

  def zad7()= {
    val exampleMap :Map[String, Int] = Map("x"-> 5, "y"-> 4 )

    println(safeMap(exampleMap.get("x")) )
    println(safeMap(exampleMap.get("y")))
    println(safeMap(exampleMap.get("z")))
  }

  def zad8(l: List[Int]): List[Int]= {
      if (l.length == 1)
        if (l.head != 0) l
        else List()
      else zad8(l.slice(0, l.length/2)) ::: zad8(l.slice(l.length/2, l.length))
  }

  def zad9(x: List[Int]):List[Int]= {
    x.map(a=> a + 1)
  }

  def zad10(x: List[Double]):List[Double] = {
    x.filter{el => el >= -5d && 12d >= el}
  }

}