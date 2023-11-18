package interview.greedy.GreedyFlorist

import java.util.Scanner
import kotlin.collections.arrayListOf

// Complete the getMinimumCost function below.
fun getMinimumCost(k: Int, c: Array<Int>): Int {
    var result = 0
    val buyers = arrayListOf<ArrayList<Int>>()
    for (i in 0..k)
        buyers.add(arrayListOf())
    c.sortedArrayDescending()
    for (i in 0..c.size step k) {
        (0..k).forEach { j ->
            if (i + j < k) {
                buyers[i].add(c[i + j])
            }
        }
    }
    result = buyers.map { item -> item.sum() }.sum()
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
