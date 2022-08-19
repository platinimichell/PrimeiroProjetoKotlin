fun main(){
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    while (true){
        println()
        println("***  1) Adicionar  ***")
        println("***  2) Excluir    ***")
        println("***  3) Atualizar  ***")
        println("***  4) Exibir     ***")
        println("***  5) Sair       ***\n")
        print("Digite a opção desejada: ")

        when(readln().toInt()){
            1 -> insereItem()
            2 -> excluirItem()
            3 -> atualizarItem()
            4 -> exibirItens()
            5 -> break
            else -> println("A opção digitada não existe, digite uma opção válida.")

        }
    }

}