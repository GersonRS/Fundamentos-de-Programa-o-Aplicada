import java.util.*

fun main(args: Array<String>) {

	var i: Int = 1
    
    while (i<10) {
        for (j in 7 downTo 5) {
            println("I=$i J=$j")
        }
        i+=2
    }
	
}
