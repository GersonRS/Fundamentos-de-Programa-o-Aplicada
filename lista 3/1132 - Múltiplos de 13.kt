import java.util.*

fun main(args: Array<String>) {

	val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    var soma = 0
    
    if (x < y) {
    	for (num in x..y) {
            if (num%13!=0) {
                soma+=num
            }
        }
    } else {
    	for (num in y..x) {
            if (num%13!=0) {
                soma+=num
            }
        }
    }
    
    println(soma)
	
}
