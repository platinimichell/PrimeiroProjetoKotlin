fun main(){

    /*
    2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele
     */
    val pi = 3.14



    print("Digite um número: ")
    var d = readln().toDouble()

    val raio = d / 2

    println("A área é ${pi * ( raio * raio )} e o perímetro é ${ 2 * pi * raio }")

    //format - padrao.format(numero)
    //%.2f.format() <---- padrão




}