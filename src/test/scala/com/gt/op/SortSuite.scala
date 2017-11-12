/**
  * Created by a on 2017/11/6.
  */
package com.gt.op
import org.scalatest.FunSuite

class SortSuite extends FunSuite{
  //测试冒泡算法
  test("Test bubble sort") {
    val a = Array(3, 1, 2, 5)
    val b = Array(1, 2, 3, 5)
    assert(new BubbleSort().sort(a) === b)
  }
  // 测试归并排序
  test("Test merge sort") {
    val a = Array(3, 1, 2, 5)
    val b = Array(1, 2, 3, 5)
    assert(new MergeSort().sort(a) === b)
  }

}
