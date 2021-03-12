package controleDeFluxo

fun main() {

    /*
    * No 'do while' ele executa pelo menos um vez antes de verificar a
    * expressão
    * */

    var l: Int = 10
    do {
        print("$l ")
        l+=5
    } while (l < 100 )

}