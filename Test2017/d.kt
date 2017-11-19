/**
 * Created by Tomato on 2017/11/17.
 */
import java.io.*

fun main(args: Array<String>){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val dise:MutableList<Int> = mutableListOf(1,4,2,3,5,6)
    for(i in 1..br.readLine().toInt()) {
        for (j in 1..br.readLine().toInt()) {
            when (br.readLine().toInt()) {
                1 -> {
                    val temp = dise[0]
                    dise[0] = dise[2]
                    dise[2] = dise[5]
                    dise[5] = dise[4]
                    dise[4] = temp
                }
                3 -> {
                    val temp = dise[0]
                    dise[0] = dise[4]
                    dise[4] = dise[5]
                    dise[5] = dise[2]
                    dise[2] = temp
                }
                2 -> {
                    val temp = dise[0]
                    dise[0] = dise[1]
                    dise[1] = dise[5]
                    dise[5] = dise[3]
                    dise[3] = temp
                }
                4 -> {
                    val temp = dise[0]
                    dise[0] = dise[3]
                    dise[3] = dise[5]
                    dise[5] = dise[1]
                    dise[1] = temp
                }
            }
        }
        println("Case #${i}:")
        println(dise[0])
    }

}
