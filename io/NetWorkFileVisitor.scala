package io

import scala.io.Source

/**
 * Created by darrendu on 15/9/12.
 */
object NetWorkFileVisitor extends App{

  val file = Source.fromURL("http://www.baidu.com")

  for(line <- file.getLines()){
    println(line)
  }
}
