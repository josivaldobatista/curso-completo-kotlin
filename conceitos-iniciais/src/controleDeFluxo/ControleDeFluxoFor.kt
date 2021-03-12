package controleDeFluxo

fun main() {
    // For = Loop
    // Loop infinito

    /*O 'for' assim como no Java e em outras linguagens consegue interar em um
    * intervalo de valores, ou seja, ele consegue pegar valor por valor
    * */

    val str = "Valdo Batista" // <- cadeia de caracteres

    for (c in str) {
        print("$c ") // <- percorrendo cada elemento da variável str
    }

    println("-------------------------------")
    for (i in 0..100 step 5) { // <- O 'Step mostra de acordo com o valor após ele nesse caso de 5 em 5'
        print("$i ")           // Em outras linguagens teria que fazer um if e else
    }

    for (i in 1..10 step 2) {
        if (i == 2) {
            println("tem dois")
        } else {
            println("Não tem dois")
        }
        print("$i ")
    }

    // DownTo

    for (i in 100 downTo 0 step 5) {
        print("$i ")
    }

}