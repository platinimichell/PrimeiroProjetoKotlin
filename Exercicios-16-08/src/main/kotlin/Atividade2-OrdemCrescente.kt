fun main () {

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */

    var numAux: Int = 0

    print("Digite o 1º número: ")
    var num1 = readln().toInt()

    print("Digite o 2º número: ")
    var num2 = readln().toInt()

    print("Digite o 3º número: ")
    var num3 = readln().toInt()

    if (num1 > num2) {
        numAux = num1;
        num1 = num2;
        num2 = numAux;
    }

    if (num2 > num3) {
        numAux = num2;
        num2 = num3;
        num3 = numAux;

    }
    if (num1 > num2) {
        numAux = num1;
        num1 = num2;
        num2 = numAux;
    }

    println("AoOrdem crescente dos números é : $num1, $num2, $num3.")



}