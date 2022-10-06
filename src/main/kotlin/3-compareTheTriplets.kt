
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    /* 1. yol
    var scoreA = (0..2).count {a[it] > b[it]}
    var scoreB = (0..2).count {a[it] < b[it]}
    */

    var scoreA = 0
    var scoreB = 0

    for(i in 0..2) {
        if(a[i] > b[i]){
            scoreA +=1
        } else if(a[i] < b[i]){
            scoreB +=1
        }
    }
    return arrayOf(scoreA,scoreB)
}

fun main() {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
