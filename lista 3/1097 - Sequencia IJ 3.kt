import java.util.*

fun main(args: Array<String>) {

	var i: Int = 1
    
    while (i<10) {
        for (j in i+6 downTo i+4) {
            println("I=$i J=$j")
        }
        i+=2
    }
	
}
