package traitTest

/**
 * Created by darrendu on 15/9/12.
 */
class TraitTest {

}

trait Logger{
  def log(msg : String){
    println("log"+msg)
  }
}

/**
 * 1.如果特质是类第一个要继承，应该使用extends，而不是with
 * 2.特质就是可以定义方法的接口
 */
//
class Test extends Logger{
  def test(){
    log("test trait")
  }
}

object TraitTest extends App{
  val test = new Test
  test.test()
}
