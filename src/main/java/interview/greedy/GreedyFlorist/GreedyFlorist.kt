package interview.greedy.GreedyFlorist

import java.util.Scanner
import kotlin.collections.arrayListOf

@SuppressWarnings("PMD")
// Complete the getMinimumCost function below.
fun getMinimumCost(k: Int, c: Array<Int>): Int {
    var result = 0
    val buyers = arrayListOf<ArrayList<Int>>()
    for (i in 0 until k)
        buyers.add(arrayListOf())
    val sorted = c.sortedArrayDescending()
    for (i in sorted.indices step k) {
        (0 until k).forEach { j ->
            if (i + j < sorted.size)
                buyers[j].add(sorted[i + j])
        }
    }
    (0 until k).forEach {
        i ->
        (0 until buyers[i].size).forEach {
            j ->
            result += buyers[i][j] * (1 + j)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val minimumCost = getMinimumCost(k, c)

    println(minimumCost)
}
