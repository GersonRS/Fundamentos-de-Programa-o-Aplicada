import java.util.*

fun main(args: Array<String>) {

	var continua = 1
    var qtdGrenai = 0
    var inter = 0
    var gremio = 0
    var empate = 0
	do {
        qtdGrenai++
        val entradas = readLine()!!.split(" ")
        var golsInter = entradas[0].toInt()
        var golsGremio = entradas[1].toInt()
        
        if (golsInter == golsGremio)
        	empate++
        else if (golsInter > golsGremio)
        	inter++
        else
        	gremio++
        
        println("Novo grenal (1-sim 2-nao)")
        var continua = readLine()!!.toInt()
	} while (continua!=2)
    
    println("$qtdGrenai grenais")
    println("Inter:$inter")
    println("Gremio:$gremio")
    println("Empates:$empate")
    var msg = if (inter == gremio)
    	"Nao houve vencedor"
    else if (inter > gremio)
    	"Inter venceu mais"
    else
    	"Gremio venceu mais"
    println(msg)
	
}
