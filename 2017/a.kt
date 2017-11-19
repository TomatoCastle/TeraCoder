/**
 * Created by Tomato on 2017/11/18.
 */

import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val sAndOandC = br.readLine().split(" ").map { f -> f.toInt() }
        println("Case #${i}:")
        println(
            if(sAndOandC[0] - (sAndOandC[1] + sAndOandC[2]) >=0) (sAndOandC[1] + sAndOandC[2]).toString()
            else "NG"
        )
    }
}