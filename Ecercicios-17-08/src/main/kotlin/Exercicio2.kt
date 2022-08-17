fun main(){

    /*
    2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
     */

    var impar = 0
    var par = 0

    for (i in 1..10){
        print("Digite um número: ")
        val i = readln().toInt()
        if ( i % 2 == 0 ){
            par++
        }
        else{
            impar++
        }

    }
    println("Total de números pares: $par e o total de números ímpares: $impar")

}