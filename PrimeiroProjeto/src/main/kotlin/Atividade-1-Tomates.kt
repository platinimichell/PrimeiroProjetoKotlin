fun main() {
    val Reg = 50
    val Multa = 4

    print("Qual peso você comprou?: ")
    var Peso = readln()!!.toDouble()
    val Exc = Peso - Reg

    /*if(Peso <0 ){
        print("O valor informado não é valido, digite outro valor: ")
        var Peso:Int = readln()!!.toInt()
        //CASO DESEJE CONSIDERAR UM VALOR MENOR QUE ZERO NULO E INFORMAR QUE NÃO É VÁLIDO
    }*/


    if(Peso > Reg) {
        println("Passaram ${Peso - Reg} kg além do regulamentado!")
        println("A multa é de R$: ${Exc * Multa}!")
    }
    else{
        println("O peso que você comprou está dentro do regulamento, não tem de pagar multa!")
    }


}