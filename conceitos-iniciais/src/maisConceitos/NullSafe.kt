package maisConceitos

fun main() {

    //KOTLIN É UMA LINGUAGEM NULL SAFE

    val str: String? = null // <- Assim declaramos variável nula

    println(str?.length) // Temos que chamar nossas variáveis com o 'nullSafe'

    /*
    * O Kotlin por baixo dos panos trata o problema do nulo, em java teria-mos um
    * 'NullPointerException' mas em kotlin teve um retorno de apenas null.
    * */

    if (str != null) {      // O Kotlin permite usar o str.lenght sem o ponto de
        println(str.length) // interrogação caso haja uma validação antes.
    }

    // println(str!!.length)    // As duas exclamações diz que eu estou ciente do problema
                                // e se der erro deixa dar o erro, e agora sim tivemos o
                                // erro 'NullPointerException'.
}