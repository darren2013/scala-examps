/**
 * Created by darrendu on 15/9/10.
 */
object Iterator {

  def main(args: Array[String]) {
    val b = (2,3,4,5)

    for(i <- b.productIterator){
      println(i)
    }
  }
}
