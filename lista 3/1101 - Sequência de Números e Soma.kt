import java.util.*

fun main(args: Array<String>) {

	while (true) {
	    val entrada = readLine()!!.split(" ")
        val n = entrada[0].toInt()
        val m = entrada[1].toInt()
        var soma = 0
        if (n > 0 && m > 0)
            if (n < m){
                for (num in n..m) {
                    soma += num
                    print("$num ")
                }
                println("Sum=$soma")
            } else {
                for (num in m..n) {
                    soma += num
                    print("$num ")
                }
                println("Sum=$soma")
            }
        else
        	break
    }
	
}
