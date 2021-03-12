package controleDeFluxo
/*
* No kotlin o If e Else é uma expressão, ou seja ele retorna um valor
* e por isso posso fazer a atribuição dele logo de cara em uma variável
* como visto abaixo com o 'bonus' recebendo o if e else.
* */
fun calculaBonus2(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

fun valorMaiorQue(valor: Int): String {
    return if (valor == 10) "Sim" else "Não"
}

// Obs.: Para identar o códio no mac é command + alt 'L'

fun main() {
    println("--------------------------")
    println(calculaBonus2("Coordenador", 2500.00f))
    println(calculaBonus2("Gerente Junior", 2500.00f))
    println(calculaBonus2("Gerente Senior", 2500.00f))

    // OPERADOR TERNÁRIO
    /*
    * No Java temos um operador chamado Operador Ternário
    * que simplifica o uso do if else. Veja abaixo um exemplo dele:
    *
    * String str = valor == 10 ? "Sim" : "Não";
    *
    * Mas no Kotlin não temos esse operador pois com o if e else
    * podemos fazer a mesma coisa que o operador ternário faz.
    * */

    println(valorMaiorQue(10))


}
