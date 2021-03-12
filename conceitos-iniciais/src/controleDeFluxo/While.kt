package controleDeFluxo

fun main() {

    /*
    * Para o 'while' enquanto um valor for verdade ele vai continuar executando
    * no exemplo abaixo temos um exemplo de execução infinita pois o valor dentro
    * do parenteses é verdadeiro.
    * */

    /* LOOP INFINITO
    while (true) {
        println("Valdo Batista")
    }
     */

    while (false) { // <- se for falso nunca vai excutar
        println("Não vai executar nada")
    }

    // Vamos para um exemplo concreto
    var index: Int = 0
    while (index <= 100) {
        print("$index ")
        index++

        if (index == 50) {
            break // <- Uso 'break' para parar o fluxo em alum momento
            // obs.: o 'break também funciona no For'
        }
    }

}