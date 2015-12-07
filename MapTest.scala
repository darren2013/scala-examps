/**
 * Created by darrendu on 15/9/10.
 */
object MapTest {

  def main(args: Array[String]) {
    val map = Map("Jack" -> 23,"Lucy" -> 34)

    for((k,v) <- map){
      println("key:"+k+" value:"+v)
    }
  }
}
