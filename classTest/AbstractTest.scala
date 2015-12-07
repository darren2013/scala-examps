package classTest

/**
 * Created by darrendu on 15/9/12.
 */



class AbstractTest{

}

/**
 * 1.抽象类 类中一个或多个方法没有完整定义
 * 2.声明抽象方法不需要加abstract关键字，只要不写方法体
 * 3.子类重写父类方法不需要加override
 * 4.父类可以声明抽象字段，没有初始值
 * 5.子类重写父类字段时，不需要加override
 *
 *
 *
 */

abstract class Person3{
  def speak
  val name : String
  val age :Int
}

class Student3 extends Person3{
  def speak={
    print("speak....")
  }

  val name = "Jack"
  val age = 20
}



object AbstractTest extends  App{
  val s = new Student3
  s.speak
  println(s.name+":"+s.age)
}
