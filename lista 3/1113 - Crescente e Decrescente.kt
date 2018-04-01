import java.util.*

fun main(args: Array<String>) {

	while (true) {
        val entrada = readLine()!!.split(" ")
        val x = entrada[0].toInt()
        val y = entrada[1].toInt()
        if (x != y)
            if (x > y){
                println("Decrescente")
            } else {
                println("Crescente")
            }
        else
        	break
    }
	
}
