import java.util.*

fun main(args: Array<String>) {

	var continua = 1
	do {
        var nota1: Double = -1.0
        var nota2: Double = -1.0
        var media: Double
        while (true) {
            val nota = readLine()!!.toDouble()
            if (nota >= 0 && nota <= 10) {
                if(nota1 < 0)
                    nota1 = nota
                else
                    nota2 = nota
            } else
                println("nota invalida")

            if (nota1 >=0 && nota2 >= 0) {
                media = (nota1+nota2)/2
                println("media = ${String.format("%.2f",media)}")
                break
            }
        }
        while (true) {
            println("novo calculo (1-sim 2-nao)")
            var opcao = readLine()!!.toInt()
            if ( opcao == 1 || opcao == 2){
                continua = opcao
                break
            }
        }
	} while (continua!=2)
	
}
