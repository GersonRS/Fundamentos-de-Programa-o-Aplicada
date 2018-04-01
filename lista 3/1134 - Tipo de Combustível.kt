import java.util.*

fun main(args: Array<String>) {

	var alcool = 0
    var gasolina = 0
    var diesel = 0

    do {
        val num = readLine()!!.toInt()
        if(num!=4){
            when (num) {
                1 -> alcool++
                2 -> gasolina++
                3 -> diesel++
            }
        } else {
            break
        }
    } while (true)
    
    println("MUITO OBRIGADO")
    println("Alcool: $alcool")
    println("Gasolina: $gasolina")
    println("Diesel: $diesel")
	
}
