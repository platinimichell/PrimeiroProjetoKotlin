fun main() {

    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
       categoria ela se encontra:
       10-14 infantil
       15-17 juvenil
       18-25 adulto
     */

    print("Qual sua idade: ")
    var idade = readln().toInt()

    when ( idade ) {
        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto jovem")
        in 26..35 -> println("Adulto experiente")
        in 36..45 -> println("Adulto sênior")
        in 46..50 -> println("Jovem idoso")
        in 51..122 -> println("Idoso")

        else -> println("Criança")

    }
}