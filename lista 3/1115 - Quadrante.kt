import java.util.*

fun main(args: Array<String>) {

	while (true) {
	    val entrada = readLine()!!.split(" ")
        val x = entrada[0].toInt()
        val y = entrada[1].toInt()
        if (x != 0 && y != 0){
            if (x>0.0 && y>0.0) { 
                println("primeiro"); 
            } 
            else if (x<0.0 && y > 0.0) { 
                println("segundo"); 
            } 
            else if (x< 0 && y < 0) { 
                println("terceiro"); 
            } 
            else if (x > 0 && y < 0) { 
                println("quarto");
            } 
        } else
        	break
    }
	
}
