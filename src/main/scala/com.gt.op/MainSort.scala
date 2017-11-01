package com.gt.op
import java.util.Date
import scala.util.Random
/**
  * Created by a on 2017/10/31.
  * 测试排序算法
  */
object MainSort {

  def main(args: Array[String]): Unit = {
    val total = 100000
    val input_data = (0 to total).map(x => (new Random()).nextInt(total)).toArray
    println(s"一共有${total}个数字")

    val start = new Date()
    val bs = new BubbleSort()
    bs.sort(input_data)
    val end = new Date()
    println(s"bubble sort cost ${(end.getTime-start.getTime)/1000.0}s")




  }

}
