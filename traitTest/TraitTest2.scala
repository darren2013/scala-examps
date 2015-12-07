package traitTest

/**
 * Created by darrendu on 15/9/12.
 */
class TraitTest2 {

}

trait Logger2{
  def log(msg : String)
}

//子特质可以覆盖父特质的方法，而不用加override
trait ConsoleLogger extends Logger2{
  def log(msg : String){
    println("msg:"+msg)
  }
}

class Test2 extends ConsoleLogger{
  def test(): Unit ={
    log("hello")
  }
}

object TraitTest2 extends App{
  var t = new Test2
  t.test()
}
