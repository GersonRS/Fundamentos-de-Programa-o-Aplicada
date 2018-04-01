import java.util.*

fun main(args: Array<String>) {

	val valor = readLine()!!.toInt()
	
	for (num in 1..10)
	    println("$num x $valor = ${num*valor}")
	
}
