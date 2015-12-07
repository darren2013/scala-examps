/**
 * Created by darrendu on 15/9/10.
 */
object MapTest2 {

  def main(args: Array[String]) {
    val b = Map("Jack" -> 44,"Lucy" -> 55)
    //如果不关心value
    for((k,_) <- b){
      println(k)
    }

    //如果不关心value
    for((_,v) <- b){
      println(v)
    }
  }
}
