/**
 * Todos os tipos de dados que existem no java também tem no Kotlin
 * na verdade são os mesmo. Veja abaixo:
 *
 * Type      -> Byte
 * Double    -> 64
 * Float     -> 32
 * Long      -> 64
 * Int       -> 32
 * Short     -> 16
 * Byte      ->  8
 * Boolean   ->  ?
 * String    ->  ?
 * Char      ->  ?
 */

/**
 * Lembrando sobre unidades de medida
 * 1 Byte           ->  8 bits
 * 1 kilobyte(kb)   ->  1024 bytes
 * 1 megabyte(mb)   ->  1024 kilobytes
 * 1 gigabyte(GB)   ->  1024 megabyte
 * */
fun main() {

    /**
     * No Kotlin existem o conceito de inferência, que quando não
     * informamos o tipo da variável ela automaticamente adiciona o tipo
     * pelo valor atribuido a ela.
     * */
    var nome = "Bob da Silva"

    /**
     * Também posso colocar o tipo da variável explicitamente
     * */
    var idade: Byte = 13

    var peso: Float = 95.8f
    var casado: Boolean = true
    var sexo: Char = 'M'

    println("TAMANHO DOS TIPOS DE DADOS")
    println("Double: Max: " + Double.MAX_VALUE + " - Double: Min: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " - Float: Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " - Long: Min: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " - Int: Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " - Short: Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " - Byte: Min: " + Byte.MIN_VALUE)
}