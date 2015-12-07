/**
 * Created by darrendu on 15/9/10.
 */
class Complex(real : Double,imaginary : Double) {

  def re()=real

  def im()=imaginary

  override  def toString()=
      ""+re+(if(im < 0) "" else "+")+im +"i"
}
