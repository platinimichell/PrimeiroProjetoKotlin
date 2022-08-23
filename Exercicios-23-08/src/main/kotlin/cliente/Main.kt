package cliente

fun main(){
    /*
    1. Cria uma Classe cliente.Cliente, contendo os atributos encapsulados, um construtor padrão
    nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch
     */
    try {

        print("Digite seu nome: ")
        val nome = readln()

        print("Digite seu endereço: ")
        val end = readln()

        print("Digite seu telefone: ")
        val fone = readln()

        val cliente = Cliente(nome, end, fone)


        while (true) {
            println()
            println("***        MENU        ***")
            println("***  1) Adicionar item ***")
            println("***  2) Excluir item   ***")
            println("***  3) Exibir item    ***")
            println("***  4) Sair       ***\n")
            print("Digite a opção desejada: ")

            when (readln().toInt()) {
                1 -> {
                    print("Digite o item que você quer inserir: ")
                    val item = readln()
                    cliente.insereItem(item)
                }
                2 -> {
                    print("Digite o item que deseja remover: ")
                    val item = readln()
                    cliente.excluirItem(item)
                }
                3 -> {
                    cliente.exibirItens()
                }
                4 -> break
                else -> println("A opção digitada não existe, digite uma opção válida.")

            }
        }
    }catch (e: Exception){
        print(e.message)
    }

}