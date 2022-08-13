fun main(){

    print("Qual sua idade?: ")
    var idade = readln()!!.toInt()

    if (idade <= 7){
        println("Categoria infantil A")
    }

    else if (idade <= 11) {
        println("Categoria infantil B")
    }

    else if(idade <= 13) {
        println("Categoria juvenil A")
    }

    else if (idade <= 17) {
        println("Categoria juveil B")
    }
    else if (idade >= 18) {
        println("Categoria adulto")
    }

}