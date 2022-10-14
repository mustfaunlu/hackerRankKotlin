import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {

   /*val max = arr.max()
    val min = arr.min()
    val sum = arr.sumOf{it.toLong()}  or val sum = arr.map{it.toLong()}.sum()

    val mini = sum - max
    val maxi = sum - min

    print("$mini $maxi") */

    var min = arr[0]
    var max = arr[0]
    var sum = 0L // cause of 1<=arr[i]<=10^9
    for (element in arr){
        if (element < min){
            min = element
        }
        if (element > max) {
            max = element
        }

        sum += element
    }

    val minSum = sum - max
    val maxSum = sum - min
    print("$minSum $maxSum")


}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
