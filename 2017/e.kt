import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by Tomato on 2017/11/18.
 */

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val cAndL = br.readLine().split(" ").map({i-> i.toInt()})
        val E = br.readLine().split(" ").map({i -> i.toInt()})
        var cnt = 0
        cnt += E.filter { i -> i >= cAndL[0] }.count()
        val other = E.filterNot { i -> i >= cAndL[0] }.sortedDescending()
        for (){

        }
        println("Case #${i}:")

    }
}
fun checkMax()