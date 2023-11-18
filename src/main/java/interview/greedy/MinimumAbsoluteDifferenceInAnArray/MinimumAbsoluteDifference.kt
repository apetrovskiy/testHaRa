import java.util.Scanner

// Complete the minimumAbsoluteDifference function below.
fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    // for ktlint only
    listOf(arr).forEach { println(it) }

    return 0
}

fun main(args: Array<String>) {
    // for ktlint only
    listOf(args).forEach { println(it) }

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)

    println(result)
}
