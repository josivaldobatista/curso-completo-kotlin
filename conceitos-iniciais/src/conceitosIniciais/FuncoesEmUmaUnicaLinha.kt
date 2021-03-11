
/*
* Assim como o java, o kotlin não permite que tenha duas funções
* com a mesma assinatura
* */

fun hello2(nome: String, idade: Int): String { // <- assinatura diferente
    return "Olá, $nome"
}

/*
* Para declarar funções com uma única linha ela precisa ter apenas
* uma instrução. Veja abaixo como faze-lo:
* */
fun hello2(nome: String) = "Olá, $nome" // <- função de única linha

fun soma(a: Int, b: Int) = a + b


fun main() {
    // O kotlin permite que funções sejam simplificadas
    println(hello("Maria da Silva"))
    println(soma(2, 2))
}

