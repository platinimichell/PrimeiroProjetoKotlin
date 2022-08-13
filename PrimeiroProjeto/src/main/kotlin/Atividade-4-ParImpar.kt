fun main(){

    print("Escreva um número: ")
    var Num = readln()!!.toInt()

    var Resultado = Num % 2

    if ( Resultado == 0 ){
        print("O número $Num é par e é")
    }
    else{
        print("O número $Num é ímpar e é")
    }
    if ( Num > 0){
        print("positivo.")
    }
    else{
        print("negativo.")
    }



}