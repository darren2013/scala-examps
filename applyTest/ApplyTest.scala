package applyTest

/**
 * Created by darrendu on 15/9/12.
 */
class ApplyTest {
  def apply()="class level apply..."
  println("Apply Test declaration body....")
}

//object ApplyTest本身就是一个单实例的
object ApplyTest{
  var counter : Int = 0

  def apply()= new ApplyTest

  def staticMethod=print("this is like a static method as java")

  def count(): Unit ={
    counter = counter + 1
  }
}



object Basic extends App{
  //scala中没有静态方法，但是我们可以使用object方法来实现
  //ApplyTest.staticMethod

  //t已经是一个ApplyTest实例，因为在调用 类名()，会自动调用object apply方法
  var t = ApplyTest()
  println(t)

  var at = new ApplyTest()
  //实例名(),会自动调用class apply方法
  println(at())

  for(i <- 1 to 10){
    ApplyTest.count()
    println(ApplyTest)
  }

  println(ApplyTest.counter)

}
