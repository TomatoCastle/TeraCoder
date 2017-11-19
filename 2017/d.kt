import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.min

/**
 * Created by Tomato on 2017/11/18.
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (j in 1..br.readLine().toInt()) {
        val NFP = br.readLine().split(" ").map { i -> i.toDouble() }
        var result = NFP[0].toInt()
        for(i in 1 .. NFP[0].toInt()){
            var nonpar = 1.0
            for(k in 1..NFP[1].toInt()){
                nonpar *= (NFP[0]+1.0-k-i)/(NFP[0]+1.0-k)
            }
            val par = (1.0 - nonpar) * 100
            if (par >= NFP[2]){
                result = i
                break
            }
        }
        println("Case #${j}:")
        println(result)
    }
}
