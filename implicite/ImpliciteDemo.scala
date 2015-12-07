package implicite

import java.io.File

import scala.io.Source

/**
 * Created by darrendu on 15/9/13.
 */

class ImpliciteDemo{

}

object ImpliciteDemo extends App{
  import Context.file2RichFile
  val file = new File("/Users/darrendu/Downloads/accounts.json")
  println(file.read)
}

class RichFile(val file : File){
  def read=Source.fromFile(file).mkString
}

object Context{

  implicit def file2RichFile(file : File) : RichFile =new RichFile(file)
}
