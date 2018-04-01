import java.util.*

fun main(args: Array<String>) {

	val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()
    
    if (x < y) {
    	for (num in x+1..y-1) {
            if (num%5==2 || num%5==3) {
                println(num)
            }
        }
    } else {
    	for (num in y+1..x-1) {
            if (num%5==2 || num%5==3) {
                println(num)
            }
        }
    }
	
}
