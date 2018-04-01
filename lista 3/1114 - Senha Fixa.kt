import java.util.*

fun main(args: Array<String>) {

	while (true) {
        val senha = readLine()!!.toInt()
        if (senha == 2002){
            println("Acesso Permitido")
            break
        } else 
        	println("Senha Invalida")
    }
	
}
