fun main() {
    /*
    1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.
     */

    val ano = 2022

    //pode usar assim val ano = LovalDate.now().year <--- para definir ano


    print("Qual sua idade?: ")
    val idade = readln().toInt()


    println("Você nasceu no ano ${ ano - idade }.")

}
