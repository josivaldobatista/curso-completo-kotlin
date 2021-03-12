package controleDeFluxo

/*
* O if e else é igual ao usado no Java
* */
fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade!")
    } else {
        println("Não é maior de idade")
    }
}

fun calculaBonus(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior, Coordenador
    val bonus: Float
    if (cargo == "Coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}

// Obs.: Para identar o códio no mac é command + alt 'L'

fun main() {
    maiorDeIdade(10)
    maiorDeIdade(17)
    maiorDeIdade(22)
    println("--------------------------")
    println(calculaBonus("Coordenador", 2500.00f))
    println(calculaBonus("Gerente Junior", 2500.00f))
    println(calculaBonus("Gerente Senior", 2500.00f))
}
