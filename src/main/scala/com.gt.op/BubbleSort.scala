package com.gt.op

/**
  * Created by a on 2017/10/31.
  * 冒泡排序
  */
class BubbleSort extends BaseSort{

  override def sort(input_data: Array[Int]): Array[Int] = {
    val a_len = input_data.length
    for(i <- 0 until a_len-1){
      for(j <- 0 until a_len-i-1){
        if(input_data(j) > input_data(j+1)){
          val temp = input_data(j)
          input_data(j) = input_data(j+1)
          input_data(j+1) = temp
        }
      }
    }
    input_data

  }

}

object BubbleSort{

}

