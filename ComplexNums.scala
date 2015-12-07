/**
 * Created by darrendu on 15/9/10.
 */
object ComplexNums {

  def main(args: Array[String]) {
    val complex = new Complex(1.2,3.5)

    println(complex.im()+",rel:"+complex.re())

    println(complex)
  }
}
