package cn.org.wyxxt

import org.apache.spark.mllib.linalg.SparseVector


/**
 * @createBy IntelliJ IDEA
 * @time 2021/6/16 上午11:19
 * @author xingzhiwei
 * @email jsjxzw@163.com 
 */

object TestVector {
  def main(args: Array[String]): Unit = {
    val vector = new SparseVector(10, Array(1,3,5), Array.fill(3)(99))
    println(vector.toDense)
    Array.fill(3)(99).foreach(println)
  }
}
