/**
 * Created by darrendu on 15/9/10.
 */
object TimerAnonymous {

  def oncePerSecond(callback : () => Unit): Unit ={
    while(true){callback();Thread sleep 1000}
  }
  def main(args: Array[String]) {
    oncePerSecond(() =>
              {println("time flies like an arrow.....")})
  }
}
