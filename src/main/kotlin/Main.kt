import com.sun.jdi.IntegerValue
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main(args: Array<String>) {

    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        var n = readLine()!!.trim().toInt()

        val result = handshake(n)

        println(result)
    }
}

fun handshake(n: Int): Int {
    // Write your code here
    var result:Int = 0
    var n1 = n
    if (n1<2){
        return  0
    }
    for (i in 1..n1) {

        result = result + (n1-1)
        n1--
        if(n1==1){
            break
        }
    }
    return result
}



