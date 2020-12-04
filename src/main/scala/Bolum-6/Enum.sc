object Margin extends Enumeration {
  type Margin = Value
  val TOP, BOTTOM, LEFT, RIGHT = Value
}

import Margin._
val currentMargin = Margin.TOP
if (currentMargin == TOP) println("working on Top")
Margin.values foreach println

sealed trait Padding
case object UP extends Padding
case object DOWN extends Padding

val currentMargin2 = UP
if (currentMargin2 eq UP) println("working on Top for sealed")

object Size extends Enumeration {
  type Size = Value
  val XL = Value("XLARGE")
  val L = Value("LARGE")
  val M = Value("MEDIUM")
  val S = Value("SMALL")
  val XS = Value("XSMALL")
}
Size.XL
Size.values foreach println
Size.withName("XLARGE")
//Size.withName("XL")
Size.values.toList

import Size._
def matching(size: Size): String = {
  size match {
    case Size.XL => "this is a xlarge size"
    case Size.L => "this is a large size"
    case _ => "another size"
  }
}

val matched = matching(Size.XL)

//---------------------- Enum type with some attributes ----------------------
sealed abstract class Weekday(val name: String,
                              val shortName: String,
                              val isWeekDay: Boolean,
                              val dayOfTheWeek: Int) extends Ordered[Weekday] {

  def compare(that: Weekday) = this.dayOfTheWeek - that.dayOfTheWeek
}

case object Monday extends Weekday("Monday", "Mo.", true, 2)
case object Tuesday extends Weekday("Tuesday", "Tu.", true, 3)
case object Wednesday extends Weekday("Wednesday", "We.", true, 4)
case object Thursday extends Weekday("Thursday", "Th.", true, 5)
case object Friday extends Weekday("Friday", "Fr.", true, 6)
case object Saturday extends Weekday("Saturday", "Sa.", false, 7)
case object Sunday extends Weekday("Sunday", "Su.", false, 1)

Monday
