import java.util.*

fun main(args: Array<String>) {

	val (x,y) = readLine()!!.split(" ")
    
    for (num in 1..y.toInt()) {
        if (num%x.toInt()!=0)
        	print("$num ")
        else
        	println(num)
    }
	
}
