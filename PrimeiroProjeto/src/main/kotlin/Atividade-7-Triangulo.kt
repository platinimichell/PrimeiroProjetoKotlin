fun main(){

    print("Digite o valor da base de um triângulo: ")
    var base = readln()!!.toInt()

    print("Digite o valor da altura de um triângulo: ")
    var altura = readln()!!.toInt()

    if ( base >= 0 && altura >= 0 ) {
        println("A área deste triângulo é: ${base * altura / 2}")
    }
    else {
        ("Não é possível calcular com estes números, por favor insira valores válidos.")
    }

}