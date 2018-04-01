import java.util.*

fun main(args: Array<String>) {

	val valor = readLine()!!.toInt()
	
	for (num in 1..10000)
	    if (num%valor==2)
	        println(num)
	
}
