
object NBD2 {

  def main(args: Array[String]) = {
    zad1()
    zad2()
    zad3()
    zad4()
    zad5()
  }

  def zad1(): Unit = {

    def matcher(n: String): String = {
      return  n match {
        case "Poniedzialek" => "Praca"
        case "Wtorek" => "Praca"
        case "Sroda" => "Praca"
        case "Czwartek" => "Praca"
        case "Piatek" => "Praca"
        case "Sobota" => "Weekend"
        case "Niedziela" => "Weekend"
        case _ => "Nie ma takiego dnia"
      }
    }

    val weekdays = Array("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela", "Nie ma takiego")

    println("Zad 1")
    for ((weekday, idx) <- weekdays.zipWithIndex) {
      println(weekday + " matches to " + matcher(weekday))
    }
  }

  def zad2(): Unit = {
    var konto: KontoBankowe = new KontoBankowe()
    konto.wpłać(1000)
    konto.wypłać(500)
    println("Zad 2")
    println("Stan konta po operacjach " + konto.stanKonta)
  }

  def zad3(): Unit = {

    def matcher(o: Osoba): String = {
      o match {
        case Osoba("Kamil", "Dabrowski") => "hello"
        case Osoba("Natalia", "Smith") => "Najpopularniejsze nazwisko"
        case Osoba("Adam", "Francuz") => "Si si, threbie, ratatuj"
        case _ => "Witamy w kolonii 👊"
      }
    }
    val kamil = Osoba("Kamil", "Dabrowski")
    val natalia = Osoba("Natalia", "Smith")
    val adam = Osoba("Adam", "Francuz") 
    val bezi = Osoba("Bez", "imienny") 
    println("Zad 3")
    println("Kamil: " + matcher(kamil))
    println("Natalia: " + matcher(natalia))
    println("Adam: " + matcher(adam))
    println("Bezimienny: " + matcher(bezi))
  }

    def zad4(): Unit = {
    def transformFunction(x: Int): Int = {
      return x + 1
    }
    def higherOrderFunction(valueToActUpon: Int, transformFunction: Int => Int): Int = {
      val applyThreeTimes = Function.chain(List.fill(3)(transformFunction))
      return applyThreeTimes(valueToActUpon)
    }

    val result = higherOrderFunction(3, transformFunction)
    println("zad 4: " + result)
  }

  def zad5():Unit = {
    println("zad 5")
    val student = new Osoba5() with Student;
    println("Student, podatek: " + student.podatek)
    val pracownik = new Osoba5() with Pracownik;
    pracownik.pensja = 10000d;
    println("Pracownik")
    println("podatek: " + pracownik.podatek + " przy pensji: " + pracownik.pensja)
    val nauczyciel = new Osoba5() with Nauczyciel;
    nauczyciel.pensja = 1000d;
    println("Nauczyciel")
    println("podatek: " + nauczyciel.podatek + " przy pensji: " + nauczyciel.pensja)
    val pracownikStudent = new Osoba5() with Pracownik with Student
    pracownikStudent.pensja = 5000d
    println("pracownik i Student podatek: " + pracownikStudent.podatek + " przy pensji: " + pracownikStudent.pensja)
  }

}

class KontoBankowe() {
  private var _stanKonta: Double = 0
  def this(stanKonta: Double) = {
    this()
    this.stanKonta = stanKonta
  }
  def stanKonta: Double = _stanKonta
  private def stanKonta_= (value: Double):Unit  = {_stanKonta = value}
  def wpłać(wartość: Double):Unit= {
    if (wartość > 0) stanKonta += wartość
  }
  def wypłać(wartość: Double): Unit={
    if (wartość > 0 && stanKonta > wartość) stanKonta -= wartość
  }
}

case class Osoba(
  imie: String,
  nazwisko: String
)

class Osoba5 {
  private var _imie: String = "Kamil"
  private var _nazwisko: String = "Dabrowski"
  private var _podatek: Double = 0d

  def imie: String = _imie
  def nazwisko: String = _nazwisko
  def podatek: Double = _podatek
}

trait Student extends Osoba5 {
  override def podatek: Double = 0d
}

trait Nauczyciel extends Pracownik {
  override def podatek: Double = 0.1 * pensja
}

trait Pracownik extends Osoba5{
  private var _pensja = 0d
  def pensja: Double = _pensja
  def pensja_=(nowaPensja:Double): Unit = _pensja = nowaPensja
  override def podatek: Double = 0.2 * pensja

}