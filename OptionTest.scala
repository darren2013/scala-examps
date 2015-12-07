/**
 * Created by darrendu on 15/9/12.
 */
object OptionTest extends App{

  val map = Map(1 -> 2)

  map.get(1) match {
    case Some(v)=>println(v)
    case None=>println("without the key ")
  }


}
