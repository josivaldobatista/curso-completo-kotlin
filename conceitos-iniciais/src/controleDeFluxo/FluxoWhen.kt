package controleDeFluxo

// ESTRUTURA BÁSICA DO FLUXO WHEN
fun operacao(a: Int, b: Int, c: String) {
    /*when (c) {
        "Soma" -> {
            return a + b
        }
        "Subtração" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }*/

    when {
        a > 0 && b > 0 -> {
            println("Variáveis maiores que zero")
        }
    }

    // USANDO O RANGE - INTERVALO DE VALORES
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
}

fun main() {
    operacao(10, 20, "Soma")
    operacao(10, 20, "Subtração")
    operacao(10, 20, "Divisão")

}