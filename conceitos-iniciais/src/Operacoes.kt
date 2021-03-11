fun main() {
    /*
    * Aqui não tem muito segredo pois as operações abaixo tem
    * praticamente em todas as linguagens de programação
    * */

    println("2 + 2 = ${2 + 2}")
    println("2 - 2 = ${2 - 2}")
    println("2 / 2 = ${2 / 2}")
    println("2 * 2 = ${2 * 2}")
    println("10 % 4 = ${10 % 4}")
    println("2 % 2 = ${10 % 2}")

    var numero = 10

    println("Número++ ${numero++}")
    println("Número-- ${numero--}")

    println("++Número ${++numero}")
    println("--Número ${--numero}")

    numero += 2
    println("numero += $numero")

    numero -= 2
    println("numero -= $numero")

    numero /= 2
    println("numero /= $numero")

    numero *= 2
    println("numero *= $numero")

    numero %= 3
    println("numero %= $numero")
}