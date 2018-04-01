import java.util.*

fun main(args: Array<String>) {

	var num = readLine()!!.toInt()
    
    for (i in 1..num) {
        val entrada = readLine()!!.split(" ")
        val valor1 = entrada[0].toInt()
        val valor2 = entrada[1].toInt()
        var total = 0
        if (valor1 != valor2)
            if (valor1 < valor2){
                for (num in valor1+1..valor2-1) if (num%2!=0) total += num
            } else {
                for (num in valor2+1..valor1-1) if (num%2!=0) total += num
            }
        println("$total")
    }
	
}
