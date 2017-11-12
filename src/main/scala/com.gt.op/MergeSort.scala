package com.gt.op
import scala.collection.mutable.ArrayBuffer
/**
  * Created by a on 2017/11/6.
  * 归并排序
  */
class MergeSort extends BaseSort{
  override def sort(inputData: Array[Int]): Array[Int] = {
    var len = 1
    while(len<inputData.length){
      for(i <- 0 to inputData.length/2/len){
        val mergeA = this.merge(inputData.slice(i*2*len, i*2*len+len),
          inputData.slice(i*2*len+len, i*2*len+2*len))
        for(j <- mergeA.indices){
          inputData(j+i*2*len) = mergeA(j)
        }
      }
      len *= 2
    }
    inputData
  }
  def merge(a: Array[Int], b: Array[Int]): Array[Int] = {
    var i = 0
    var j = 0
    val mergeArray = new ArrayBuffer[Int]()
    while(i<a.length&&j<b.length){
      if(a(i)>b(j)){
        mergeArray += b(j)
        j += 1
      }else{
        mergeArray += a(i)
        i += 1
      }
    }
    while(i<a.length) {
      mergeArray += a(i)
      i += 1
    }

    while (j<b.length){
      mergeArray += b(j)
      j += 1
    }
    mergeArray.toArray
  }
}
