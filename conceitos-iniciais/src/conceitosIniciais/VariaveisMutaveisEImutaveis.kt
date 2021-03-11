fun main() {

    // Variáveis mutáveis
    var name = "José da Silva"
    name = "José da Silva Costa"

    // Variáveis imutáveis
    val email: String = "jose@gmail.com"
    // email = "josedasilva@gmail.com" <- Aqui teremos um erro pois não pode ser mudada

    println(name)

    // val y <- teremos um erro aqui pois precisa o 'val' precisa saber o tipo dessa variável.
    val x: Int // <- sem erro

    /**
     * O 'val' é igual a palavra reservada do Java 'final'
     * */
}