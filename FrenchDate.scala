import java.util.{Date,Locale}

import java.text.DateFormat._

/**
 * Created by darrendu on 15/9/10.
 */
object FrenchDate {

  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG,Locale.FRENCH)

    println(df format now)
  }
}
