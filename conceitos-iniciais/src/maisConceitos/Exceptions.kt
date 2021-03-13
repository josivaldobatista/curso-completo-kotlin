package maisConceitos

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {

    /*
    * As Exceções é um erro que quebra a execução do programa.
    * Abaixo temos um bom exemplo pois não é possível converter um nome
    * em um inteiro gerando assim a exceção 'NumberFormatException'.
    * */

    /*
    * Nos podemos prevenir usando uma estrutura chamada try/catch
    * Veja o exemplo abaixo:
    * */

    // println("Bob".toInt())
    try {
        println("Bob".toInt())
    } catch (ex: NumberFormatException) {
        println("Esse valor não é um número")
    } catch (e: Exception) {
        println("Algo de errado ocorreu")
    } finally {
        println("Executo sempre pois sou um finally")// <- dando erro ou não
    }

    println("depois da exceção")
    println("depois da exceção")

}