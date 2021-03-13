package maisConceitos

fun test(n1: Int) {

}

fun main() {
    /*
    * Double    -> 64
    * Float     -> 32
    * Long      -> 64
    * Int       -> 32
    * Short     -> 16
    * Byte      -> 8
    * */

    // val l1: Long = 100
    // test(1 * l1) <- vai dar problema pois os erros conversões acontecem sempre do maior para o menor

    val l1: Byte = 100
    test(1 * l1) // <- com o Byte não tem problema

    val n2: Double = Double.MAX_VALUE
    val b1: Byte = n2.toByte()

    val b3: Byte = 100

    println(n2)
    println(b1)

    /*
    * A conversão no kotlin precisa ser explicita
    * */

    println("------------------------------")
    println(b3.toShort())
    println(b3.toLong())
    println(b3.toFloat())
    println(b3.toDouble()) // Não teve problema pois todos podem converter um byte

    // TRANSFORMA UMA STRING PARA TIPOS NUMÉRICOS
    println("------------------------------")
    println("10".toInt())

    //
    println("10".toFloat())
    println("10".toDouble())

    // println("Bob".toFloat()) <- vai dar erro de 'NumberFormatException'
}