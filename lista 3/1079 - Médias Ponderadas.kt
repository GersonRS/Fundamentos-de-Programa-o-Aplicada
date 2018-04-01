import java.util.*

fun main(args: Array<String>) {

	val valor = readLine()!!.toInt()
    
    for (num in 1..valor){
        val entradas = readLine()!!.split(" ")
        var media = ((entradas[0].toDouble()*2)+(entradas[1].toDouble()*3)+(entradas[2].toDouble()*5))/10
        println(String.format("%.1f",media))
    }
	
}
