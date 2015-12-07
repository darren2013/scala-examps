/**
 * Created by darrendu on 15/9/12.
 */
class MathPatter {

}

object MathPatter extends App{
  val x = 3

  val res = x match{
    case 1 => "one"
    case 2 => "two"
    case _ => "no match"
  }

  val res2 = x match {
    case i if(i == 1) => "one"
    case i if(i == 2) => "two"
    case i => "no match"
  }



  println(res)
  println(res2)

  //类型匹配，注意定义的变量x 、s
  def t(obj : Any) = obj match {
    case x : Int => "int"
    case s : String => "string"
    case _ => "unknown type"
  }

  print(t(10))
}
