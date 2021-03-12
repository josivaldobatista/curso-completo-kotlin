package controleDeFluxo

/*OPERADOR ELVIS
* Ele é denotado pelos sinais ':?'
* */
fun main() {

    /*
    * No Kotlin uma variável é nula quando tem um ponto de
    * interrogação apos o tipo da variável
    * */
    val test: Int? = null /* <- Aqui o valor é nulo (null), se tirar o ponto de interrogação da erro*/
    /*
    * O kotlin tenta ao maximo evitar problemas de 'NullPointerException'
    * O operdor elvis trabalha com variáveis nula
    * */

    val op: Int = test ?: 100 // Se tiver valor na variável test use-a, se não atribua 100
    println(op)
}