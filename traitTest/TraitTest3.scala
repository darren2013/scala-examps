package traitTest

/**
 * Created by darrendu on 15/9/12.
 */
class TraitTest3 {

}

trait Logger3 {
  def log(msg : String): Unit ={
    print("msg"+msg)
  }
}

//子特质覆盖父类中已经实现的方法时，必须加override
trait MessageLogger extends Logger3{
   override def log(msg : String): Unit ={
    print("save message "+msg)
  }
}

abstract class Account{
  def account(num : Int)
}

class MyAccount extends Account with Logger3{
  def account(num : Int): Unit ={
    log("save "+num+" money to my account")
  }
}

object TraitTest3 extends App{
  //对象中混入特质
  //如果MessageLogger没有继承Logger3,MyAccount混入了特质Logger3,如果Logger3中的方法和MessageLogger方法冲突时，则不可取
  var mc = new MyAccount() with MessageLogger
  mc.account(200)
}
