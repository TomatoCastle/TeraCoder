import com.sun.org.apache.xpath.internal.operations.Bool
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by Tomato on 2017/11/18.
 */
fun main(args: Array<String>) {
    val f :MutableList<Int> = mutableListOf(1,1)
    for(i in 2..45){
        f.add(f[i-1] + f[i-2])
    }
    val primefobo = f.filter {i -> isPrime(i)}

    val br = BufferedReader(InputStreamReader(System.`in`))
    for (i in 1..br.readLine().toInt()) {
        val index = br.readLine().toInt()-1
        println("Case #${i}:")
        println("" + f[index] +" " + if(index >= primefobo.size){
            "NG"
        }else{
            primefobo[index]
        })
    }
}
fun isPrime(num :Int): Boolean{
    if(num == 1 || num == 0) return false
    for(i in 2..num-1){
        if(num % i == 0) return false
    }
    return true
}