package interview.greedy.GreedyFlorist

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object GreedyFloristScala {

  // Complete the getMinimumCost function below.
  def getMinimumCost(k: Int, c: Array[Int]): Int = {
    var result = 0
    val buyers = new scala.collection.mutable.ListBuffer[
      scala.collection.mutable.ListBuffer[Int]
    ]()
    for (i <- 0 until k) {
      buyers.append(new scala.collection.mutable.ListBuffer[Int]())
    }
    val sorted = c.sortWith(_ > _)

    for (i <- 0 until sorted.length by k) {
      for (j <- 0 until k) {
        if (i + j < sorted.length)
          buyers(j).append(sorted(i + j))
      }
    }
    for (i <- 0 until k) {
      for (j <- 0 until (buyers(i).length)) {
        result += buyers(i)(j) * (1 + j)
      }
    }

    result
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val minimumCost = getMinimumCost(k, c)

    printWriter.println(minimumCost)

    printWriter.close()
  }
}
