import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution0002 {

    // Complete the hourglassSum function below.
    def hourglassSum(arr: Array[Array[Int]]): Int = {
        if (null == arr || 0 == arr.length || 0 == arr(0).length)
            0
        (1 to 4).toList
            .flatMap(hourglassNumber => (1 to 4).toList
                .map(index => arr.calculateSum(hourglassNumber, index)))
                .max
    }

    implicit class ArrayExtensions(arr: Array[Array[Int]]) {
        def calculateSum(horizontal: Int, vertical: Int): Int = {
            arr(vertical)(horizontal) +
            arr(vertical-1)(horizontal-1) +
            arr(vertical-1)(horizontal) +
            arr(vertical-1)(horizontal+1) +
            arr(vertical+1)(horizontal-1) +
            arr(vertical+1)(horizontal) +
            arr(vertical+1)(horizontal+1)
        }
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val arr = Array.ofDim[Int](6, 6)

        for (i <- 0 until 6) {
            arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
        }

        val result = hourglassSum(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
