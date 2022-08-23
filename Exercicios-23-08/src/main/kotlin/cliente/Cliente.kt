package cliente

class Cliente(
    var nome: String,
    var fone: String,
    var end: String ){

    private var listaCompras = mutableListOf<String>()

    init {
       if (nome.isBlank()){
           throw Exception("Cadastro incorreto.")
       }
    }

    fun insereItem(item: String){
            if (item.isNotBlank()) {
                listaCompras.add(item)
            }else{
                println("Digite o item correto.")
        }
    }

    fun exibirItens(){
        listaCompras.forEach{
            println("*** $it ***")
        }
        println()
        println("Total de itens: ${listaCompras.size}")
    }

    fun excluirItem(item: String){
        if (listaCompras.contains(item)) {
            listaCompras.remove(item)
            println()
            println("$item excluído!")
            println()

        }else {
            println("O iten $item não existe, digite um item válido.")
        }

    }

}