import java.util.*

fun main(args: Array<String>) {

	var maior = 0
    var posicao = 0
    
    for (num in 1..100){
        val valor = readLine()!!.toInt()
        if (maior < valor){
            maior = valor
            posicao = num
        }
    }
    println(maior)
    println(posicao)
	
}
