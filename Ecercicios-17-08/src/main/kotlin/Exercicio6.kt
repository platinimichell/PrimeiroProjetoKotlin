fun main(){
    /*
    Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
     */

    var total = 0
    var qtd = 0

    do {
        print("Digite qualquer número: ")
        val num = readln().toInt()
        if ( num % 3 == 0 && num != 0){
            total += num
            qtd++
        }
    } while ( num != 0)

    println("Média dos números: ${ total / qtd }")
}