package io

import scala.io.Source

/**
 * Created by darrendu on 15/9/12.
 */
object FileVisitor extends App{

  val file = Source.fromFile("/Users/darrendu/Downloads/accounts.json")

  //按照行遍历
  /*for(line <- file.getLines()){
    println(line)
  }*/

  //按照字符打印出来
  for(c <- file){
    println(c)
  }




}
