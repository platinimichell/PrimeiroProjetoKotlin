fun main(){

    println("Insira um número: ")
    var Num1 = readln()!!.toInt()
    println("${Num1 * Num1}")

    println("Insira um número: ")
    var Num2 = readln()!!.toInt()
    println("${Num2 * Num2}")

    println("Insira um número: ")
    var Num3 = readln()!!.toInt()
    println("${Num3 * Num3}")

    println("Insira um número: ")
    var Num4 = readln()!!.toInt()
    println("${Num4 * Num4}")

    if ( Num3 * Num3 > 1000 ){
        println("${Num3 * Num3}")
    }
    else{
        println("$Num1 e ${Num1 * Num1}, $Num2 e ${Num2 * Num2}, $Num3 e ${Num3 * Num3}, $Num4 e ${Num4 * Num4}.")
    }



}