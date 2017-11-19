/**
 * Created by Tomato on 2017/11/17.
 */
import java.io.*

fun main(args: Array<String>){
    val input = BufferedReader(InputStreamReader(System.`in`))
    val map = mapOf( ".-" to "A",  "-..." to "B", "-.-." to "C",  "-.." to "D", "." to "E", "..-." to "F", "--." to "G", "...." to "H", ".." to "I", ".---" to "J", "-.-" to "K",".-.." to "L","--" to "M","-." to "N","---" to "O",".--." to "P","--.-" to "Q",".-." to "R","..." to "S","-" to "T","..-" to "U","...-" to "V",".--" to "W","-..-" to "X","-.--" to "Y","--.." to "Z")
    for(i in 1..input.readLine().toInt()){
        input.readLine()
        println("Case #${i}:")
        input.readLine().split(" ").forEach({
            f -> print(map.get(f))
        })
        println()
    }
}