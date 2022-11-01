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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {

    var hour = s.take(2).toInt()
    val amPm = s.takeLast(2)
    val middle = s.substring(2,8) //range  2..7

    if (hour == 12 && amPm == "AM") {
        hour = 0
    }

    if (hour < 12 && amPm == "PM") {
        hour += 12
    }

    val hourStr = hour.toString().padStart(2,'0')

    return hourStr + middle

}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
