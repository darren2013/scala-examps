/**
 * Created by darrendu on 15/9/10.
 */
object ArrayTest {

  def main(args: Array[String]) {
    val b = Array(1,2,3,4,5,6,7,8)

    for(i <- 0 until b.length){
      println(b(i))
    }
  }
}
