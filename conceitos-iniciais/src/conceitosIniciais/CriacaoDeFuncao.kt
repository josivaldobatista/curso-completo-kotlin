/*Declaração de funções no kotlin
*
* Declara a palavra reservada 'fun' depois damos um nome
* para essa função, abre e fecha parenteses, e dentro podemos
* ter ou não variáveis (se precisar).
* Também podemos definir se a função terá retorno ou não
* para isso, após o parenteses que fecha colocamos dois pontos ':' e
* o tipo do retorno.
* */
fun calculaBonusSemRetorno(a: Int, b: Int, c: Int) {
    println("O bonus é: ${a + b * c}")
}

fun calculaBonusComRetorno(a: Int, b: Int, c: Int): Int {
    return a + b * c
}

fun main() {
    /*
    * Quando criamos a classe definimos 'fun controleDeFluxo.main(){}' a palavra reservada
    * 'fun' representa uma função em kotlin. Palavras reservadas não podem
    * ser usadas como nomes de variáveis por exemplo. O compilador consegue
    * entender a estrutura do seu código a parti das palavras reservadas.
    * */
    // var fun = "test" <- vai dar um erro

    val a = 10;
    val b = 20
    val c = 30

    calculaBonusSemRetorno(a, b, c) // função sem retorno
    println("O valor do bonus é: ${calculaBonusComRetorno(a, b, c)}") // Função com retorno

    println(hello("${hello("Olá")} Bob da Silva"))

}

fun hello(s: String): String {
    return s
}
