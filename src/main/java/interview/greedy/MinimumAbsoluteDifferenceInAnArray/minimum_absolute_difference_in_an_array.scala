import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the minimumAbsoluteDifference function below.
    def minimumAbsoluteDifference(arr: Array[Int]): Int = {


    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val n = stdin.readLine.trim.toInt

        val arr = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = minimumAbsoluteDifference(arr)

        printWriter.println(result)

        printWriter.close()
    }
}
