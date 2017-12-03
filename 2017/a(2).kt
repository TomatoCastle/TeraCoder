/**
 * Created by Tomato on 2017/11/18.
 */

import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val (A,O,C) = br.readLine().split(" ").map { f -> f.toInt() }
        println("Case #${i}:")
        println(
            if(A - (O + C) >=0) (O + C).toString()
            else "NG"
        )
    }
}