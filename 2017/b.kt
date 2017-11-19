/**
 * Created by Tomato on 2017/11/18.
 */

import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        var nonF = true
        println("Case #${i}:")
        for(j in 1..br.readLine().toInt()){
            val m = br.readLine().split(":")
            if(m[1] == "Friend"){
                nonF = false
                println(m[0])
            }
        }
        if(nonF) println("Not Friends")
    }
}