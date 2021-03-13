package utilidadesIntellj

/*
* USANDO O DEBUG
*
* Podemos marca um 'break point' que é um momento onde o código
* irá parar a execução. Programas podem ser muito grandes, ter dezenas
* de milhares de linha de código, o break point nos ajuda na identificação
* desses erros.
*
* */

fun meuNome(nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade(nome: String, idade: Short) {
    println("Olá $nome, tenho $idade anos")
}

fun letraIndice(nome: String, indice: Int): Char {
    return nome[indice]
}

fun main() {

    meuNome("Valdo")
    meuNomeIdade("Silvana", 40)
    letraIndice("Josivaldo", 0)

    val str = "35"
    str.toInt()
}