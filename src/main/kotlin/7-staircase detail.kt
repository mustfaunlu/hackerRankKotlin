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
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

    for (i in 1..n) {
        repeat(n-i){
            print(" ")
        }
        for (j in 1..i) {
            print("#")
        }
        println()


        //ikinci for a gerek kalmadan 2 tane repeat ilede cozebiliriz. yada hic repeat kullanmadan iki for ile cozebiliriz.
//        repeat(i){
//            print("$")
//        }

    }

    //3. yol
    for (i in 1..n) {
        println( " ".repeat(n-i) + "$".repeat(i))
    }



}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
