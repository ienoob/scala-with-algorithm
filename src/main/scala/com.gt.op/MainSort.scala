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
    val input_data = (0 to total).map(x => new Random().nextInt(total)).toArray
    println(s"一共有${total}个数字")

    val start1 = new Date()
    val bs = new BubbleSort()

    bs.sort(input_data)
    val end1 = new Date()
    println(s"bubble sort cost ${(end1.getTime-start1.getTime)/1000.0}s")

    val start2 = new Date()
    val ms = new MergeSort()

    ms.sort(input_data)
    val end2 = new Date()
    println(s"merge sort cost ${(end2.getTime-start2.getTime)/1000.0}s")
  }

}
