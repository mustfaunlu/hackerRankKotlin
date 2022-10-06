
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(ar: Array<Int>): Int {
     /*
     1. yol
     var result = 0
    for(i in ar){
      result += i
    }
    return result */

    // 2. yol
    return ar.sum()

    // 3. yol
    // ar.forEach{ result += it }

}

fun main() {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
