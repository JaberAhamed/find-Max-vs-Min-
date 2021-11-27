import com.sun.jdi.IntegerValue
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val a = read.nextInt()
    var result = 0
    var minValue = 0
    var maxValue = 0
    if(a in 1..20){
        for (i in 0..a-1){
            var value = read.nextInt()
            if (i==0){
                minValue = value
                maxValue = value
            }else{
                if(value<minValue){
                    minValue = value
                }
                if(value>maxValue){
                    maxValue = value
                }

            }


        }
        result = maxValue - abs(minValue)
        println("$result")
    }


   
}





