import java.util.*

fun main(args: Array<String>) {

	val n = readLine()!!.toInt()
    
    for (num in 1..n) {
        println("$num ${num*num} ${num*num*num}")
    }
	
}
