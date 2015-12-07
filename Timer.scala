/**
 * Created by darrendu on 15/9/10.
 */
object Timer {

  def oncePerSecond(callback: () => Unit): Unit ={
    while(true){
      callback();Thread sleep 1000
    }
  }

  def timeflies(): Unit ={
    println("time flyies like an arrow.....")
  }

  def main(args: Array[String]) {
      oncePerSecond(timeflies)

  }
}
