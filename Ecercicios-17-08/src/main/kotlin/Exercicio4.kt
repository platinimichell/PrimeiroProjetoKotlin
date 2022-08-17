fun main(){
    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
     */

    var cont = 0
    var idade = 0
    var sexo = 0
    var temp = 0
    var pessoasCalmas = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outrosCalmos = 0
    var pNMaior40 = 0
    var pCMenor18 = 0

    while ( cont < 6 ){

        println("***Pessoa: ${cont+1} ***")

        print("Qual sua idade: ")
        idade = readln().toInt()

        print("Qual seu sexo (1-feminino / 2-masculino / 3-Outros): ")
        sexo = readln().toInt()

        print("Qual seu temperamento 1) Calmo, 2) Nervoso, 3) Agressivo: ")
        temp = readln().toInt()

        if ( temp == 1 ){
            pessoasCalmas++
        }
        if ( sexo == 1 && temp == 2 ) {
            mulheresNervosas++
        }
        if ( sexo == 2 && temp == 3 ) {
            homensAgressivos++
        }
        if ( sexo == 3 && temp == 1 ) {
            outrosCalmos++
        }
        if ( idade >= 40 && temp == 2 ) {
            pNMaior40++
        }
        if ( idade < 18 && temp == 1 ) {
            pCMenor18++
        }

        cont++

    }

    println("o número de pessoas calmas: $pessoasCalmas")
    println("o número de mulheres nervosas: $mulheresNervosas")
    println("o número de homens agressivos: $homensAgressivos")
    println("o número de outros calmos1: $outrosCalmos")
    println("o número de pessoas nervosas com mais de 40 anos: $pNMaior40")
    println(" número de pessoas calmas com menos de 18 anos: $pCMenor18")

}