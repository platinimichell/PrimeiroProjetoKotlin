fun main(){

    print("Qual operação você deseja realizar?\n" +
            "1)soma, 2)subtração, 3)multiplicação, 4)divisão: ")
    val oper = readln().toInt()

    print("Digite um número: ")
    val n1 = readln().toDouble()

    print("Digite um número: ")
    val n2 = readln().toDouble()

    val soma = soma(n1, n2)
    val sub = sub(n1, n2)
    val mult = mult(n1, n2)
    val div = div(n1, n2)

    if ( oper == 1 ){
        println("Resultado: ${"%.2f.".format(soma)}")
    } else if ( oper == 2 ){
        println("Resultado: ${"%.2f.".format(sub)}")
    } else if ( oper == 3  ){
        println("Resultado: ${"%.2f.".format(mult)}")
    } else if ( oper == 4 ){
        println("Resultado: ${"%.2f.".format(div)}")
    } else{
        println("Opção inválida digite um valor válido!")
    }

}