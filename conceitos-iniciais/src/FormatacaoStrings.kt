fun main() {

    // String básica
    val frase = "kotlin é uma linguagem de programação "

    // Posso fazer concatenações
    val caracteristica = "Show! "

    // Concatenação com números e strings transforma tudo em strings
    val numero = 10
    println(frase + caracteristica + numero)

    /*
    Existe um maneira mais enxuta da fazer a concatenação acima
    usando o cifrão dentro da string podemos chamar o nome da variável.
    Veja abaixo:
    */
    println("Kotlin é uma linguagem $caracteristica") // <- Código fica mais lipo

    // A função 'println' é a abreviação de System.out.println que tem no Java

    println("================================")
    /*
    Usa-se a concatenação abaixo quando o texto é muito grande (é opcional)
    Perceba que ao executar no console fica exatamente como foi
    escrita.
    */
    val str = """façfnfafda
        |fasfddasdfafd
        |asdfafafdafd
        |dfasdfa
    """.trimMargin()
    println(str)

    /*
    No kotlin eu consigo contar o tamanho de uma variável usando
    as propriedades usando o '.' e para que ele entenda que
    tem um código dentro da string insiro as 'chaves'. Veja abaixo como ficou:
    */
    println("Tamanho da variável ${caracteristica.length}")
}