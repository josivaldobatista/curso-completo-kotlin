package utilidadesIntellj

/*
* FERRAMENTAS DE ANALISE ESTÁTICA
*
* As Ferramentas de analise estáticas passam pelo nosso
* código analisando linha a linha para encontrar algum erro
* ou variáveis que podem ser melhoradas.
*
* No IntelliJ já temos uma ferramenta como essa na guia Analyze/Inspec Code
*  Ele pega tudo!
*
* */

fun meuNome2(nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade2(nome: String, idade: Short) {
    println("Olá $nome, tenho $idade anos")
}

fun letraIndice2(nome: String, indice: Int): Char {
    return nome[indice]
}

fun main() {

    meuNome("Valdo")
    meuNomeIdade("Silvana", 40)
    letraIndice("Josivaldo", 0)

    val str = "35"
    str.toInt()
}