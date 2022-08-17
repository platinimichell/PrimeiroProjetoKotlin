fun main(){
    /*
    3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
        21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
        idade for =-99. (WHILE)
     */

    var idade = 0
    var jovens = 0
    var idosos = 0

    while ( idade != 99 ){
        print("Qual sua idade: ")
        idade = readln().toInt()
        if (idade <= 21 ){
            jovens++
        }
        if (idade >= 50){
            idosos++
        }
    }
    println("Quantidade de pessoas que tem 21 anos ou menos: $jovens")
    println("Quantidade de pessoas que tem 50 anos ou mais: $idosos")

}