import kotlin.math.*

fun main () {

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */

    print("Insira um número: ")
    val num = readln().toDouble()

    val result = num % 2
    val raiz = sqrt(num)
    val potencia = num.pow(2)

    if ( result == 0.0 ) {
        println("O número $num é par e sua raiz quadrada é ${"%.2f".format(raiz)}.")
    } else {
        println("O número $num é ímpar e elevado ao quadrado é $potencia.")
    }


}