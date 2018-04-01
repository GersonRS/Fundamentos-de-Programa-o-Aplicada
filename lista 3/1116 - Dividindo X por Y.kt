import java.util.*

fun main(args: Array<String>) {

	val n = readLine()!!.toInt()
    for (i in 1..n) {
	    val entrada = readLine()!!.split(" ")
        val x = entrada[0].toInt()
        val y = entrada[1].toInt()
        
        if (y!=0)
        	println(String.format("%.1f",x.toDouble()/y.toDouble()))
        else
        	println("divisao impossivel")
    }
	
}
