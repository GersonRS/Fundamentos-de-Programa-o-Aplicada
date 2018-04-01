import java.util.*

fun main(args: Array<String>) {

	val qtdExperimento = readLine()!!.toInt()
    
    var coelhos = 0.0
    var ratos = 0.0
    var sapos = 0.0
    
    for (i in 1..qtdExperimento){
        val (qtd,tipo) = readLine()!!.split(" ")
        when (tipo) {
            "C" -> coelhos += qtd.toInt()
            "R" -> ratos += qtd.toInt()
            "S" -> sapos += qtd.toInt()
        }
    }
    
    val total = coelhos + ratos + sapos
    
    println("Total: ${total.toInt()} cobaias")
    println("Total de coelhos: ${coelhos.toInt()}")
    println("Total de ratos: ${ratos.toInt()}")
    println("Total de sapos: ${sapos.toInt()}")
    println("Percentual de coelhos: ${String.format("%.2f",(coelhos/total)*100)} %")
    println("Percentual de ratos: ${String.format("%.2f",(ratos/total)*100)} %")
    println("Percentual de sapos: ${String.format("%.2f",(sapos/total)*100)} %")
	
}
