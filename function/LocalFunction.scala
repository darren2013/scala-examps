package function

import com.sun.tools.javac.code.Flags.Flag

/**
 * Created by darrendu on 15/9/13.
 */
object LocalFunction extends App{

  def add3(x : Int,y : Int,z : Int) : Int={
    def add2(x : Int ,y : Int) : Int={
      x + y
    }

    add2(add2(x,y),z)
  }

  println(add3(1,2,3))


  def testByNameParameter(flag : Boolean): Unit ={
    println("flag="+flag)
  }

  def testByValParameter(flag: => Boolean){
    println("flag"+flag)
  }
  //byNameParameter会立即进行求值
  testByNameParameter( 3 > 1)

  //真正用的时候才进行求值
  testByValParameter( 4 > 3)
}
