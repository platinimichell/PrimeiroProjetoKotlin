fun main(){
    print("Qual nível de poluição foi detectado?: ")
    var Indice = readln()!!.toDouble()

    if ( Indice <= 0.25)
        println("O indíce $Indice é aceito.")
    else if ( Indice <= 0.3 ){
        println("Todas as indústrias do grupo 1 devem suspender as atividades imediatamente!")
    }
    else if  ( Indice <= 0.4){
        println("Todas as industrias dos grupos 1 e 2 devem suspender as atividades imediatamente!")
    }
    else if  ( Indice <= 0.5){
        println("Todas as industrias devem supender as atividades imediatamente!")
    }
    else if ( Indice >= 0.5){
        println("Todas as industrias devem supender as atividades imediatamente!")
    }




}