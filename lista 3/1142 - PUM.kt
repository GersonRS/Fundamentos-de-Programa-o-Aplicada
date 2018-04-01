import java.util.*

fun main(args: Array<String>) {

	val n = readLine()!!.toInt()
    
    for (num in 1..n*4) {
        if (num%4!=0)
        	print("$num ")
        else
        	println("PUM")
    }
	
}
