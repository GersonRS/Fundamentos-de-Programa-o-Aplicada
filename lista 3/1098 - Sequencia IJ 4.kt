import java.util.*

fun main(args: Array<String>) {

	var i: Float = 0.0f
    
    while (i<2.1) {
        for (j: Int in 1..3) {
            if (i==0.0f || i==1.0f || i>=2.0f)
            	println("I=${i.toInt()} J=${i.toInt()+j}")
            else
            	println("I=${String.format("%.1f",i)} J=${String.format("%.1f",i+j)}")
        }
        i+=0.2f
    }
	
}
