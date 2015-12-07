package caseClassDemo

/**
 * Created by darrendu on 15/9/12.
 */
class CaseClassDemo{


}

object CaseClassDemo extends App{

  def m(p : Person)= p match {
    case Teacher("AVV")=>println("teacher avv")
    case Teacher(_) => println("this is a teacher")
    case Student(_) => println("this is a student")
    case _ => println("unknown")
  }

  //1.case class不用直接new
  //2.通过成员变量将对象区分开来
  m(Teacher("a"))
  m(Teacher("AVV"))

}

abstract class Person

//case class主构造器都是val类型，不用显示指定
case class Student(name : String) extends Person

case class Teacher(name :String) extends Person
