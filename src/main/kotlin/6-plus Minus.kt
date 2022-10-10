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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    val size = arr.size.toDouble()
    /*
    1. YOL
   val positive= arr.filter { it > 0 }.size / size
   val negative = arr.filter { it < 0 }.size /size
   val neutral = arr.filter { it == 0 }.size /size
   println(String.format("%.6f",positive))
   println(String.format("%.6f",negative))
   println(String.format("%.6f",neutral)) */

    //2.YOL
   val positive=  arr.count{it>0} / size
   val neutral = arr.count{it==0} / size
   val negative =  arr.count{it<0} / size
   println(String.format("%.6f",positive))
   println(String.format("%.6f",negative) )
   println(String.format("%.6f",neutral))

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
