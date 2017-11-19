import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by Tomato on 2017/11/18.
 */
fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val wAndH = br.readLine().split(" ").map { f -> f.toInt() }
        val list = mutableListOf<List<Int>>()
        for(j in 1..wAndH[1]){
            list.add(br.readLine().split(" ").map { f->f.toInt() })
        }

        println("Case #${i}:")

    }
}
fun meem(list: MutableList<List<Int>>){
    
}