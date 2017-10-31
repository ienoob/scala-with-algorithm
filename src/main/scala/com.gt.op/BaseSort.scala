package com.gt.op

/**
  * Created by a on 2017/10/31.
  * 抽象排序类
  */
abstract class BaseSort {
  def sort[T](list: List[T]): List[T]
}
