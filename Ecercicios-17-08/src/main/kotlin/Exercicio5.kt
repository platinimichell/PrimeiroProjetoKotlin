fun main(){
    /*
    Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
     */

    var total = 0

    do { print("Digite um número qualquer: ")
        val num = readln().toInt()
        total += num
    }while( num != 0 )
    println("Soma: $total")

}