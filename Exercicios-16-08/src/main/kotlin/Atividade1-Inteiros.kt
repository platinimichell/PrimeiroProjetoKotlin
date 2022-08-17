fun main() {

    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    print("Digite o 1º número: ")
    val num1 = readln().toInt()

    print("Digite o 2º número: ")
    val num2 = readln().toInt()

    print("Digite o 3º número: ")
    val num3 = readln().toInt()

    if ( num1 > num2 && num1 > num3 ) {
        println("O 1º número é o maior, $num1.")
    } else if ( num2 > num1 && num2 > num3 ) {
        println("O 2º número é o maior, $num2.")
    } else if ( num3 > num1 && num3 > num2 ){
        println("O 3º número é o maior, $num3.")
    }



}