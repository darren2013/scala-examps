package test

/**
 * Created by darrendu on 15/9/12.
 */

//1.主构造器直接跟在类名后面，里面的字段会被编译成字段
//2.主构造器执行的时候，会执行类中所有语句
//3.去掉val或var时候，相当于类型private[this]
class Person2(var name : String,val age : Int){
  println("primary constructor is called!,and name "+name)

  var gender : String = _

  val school = "shangHai"

  //1.附属构造器可以不使用var 或val
  //2.附属构造器以this开头定义
  //3.开头必须调用主构造器或附属构造器
  def this(name : String ,age : Int,gender : String){
    this(name,age)
    this.gender = gender
  }
}

//继承
class Student(name : String ,age : Int,var major : String) extends Person2(name,age){
  println("this is the subclass of person...")
  //覆盖父类的成员变量时，一定要加override
  override val school = "BeiJing"

  //覆盖父类的方法时，一定要加override
  override  def toString = "overiider toString"


}


object ClassTest2 {

  def main(args: Array[String]) {
    //case1:
    //val p2 = new Person2("Jack",34)
    //println("name:"+p2.name+",age:"+p2.age)

    //case2:
    //val p = new Person2("Jack",34,"mail")
    //println(p.name+",age:"+p.age)

    //case3:
    var s = new Student("Jack",34,"math")
    println(s.school)

  }
}
