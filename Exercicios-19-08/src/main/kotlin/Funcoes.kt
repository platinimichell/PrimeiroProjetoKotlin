
val itens = mutableListOf<String>()

fun insereItem() {
    while (true) {
        print("Digite o item a ser adicionado: ")

        val sku = readln()

//        println("Quando concluir aperte 'Enter' para finalizar.")

        if (sku != "" ) {
            itens.add(sku)
        } else {
            break
        }
    }
}

fun excluirItem(){
    print("Deseja excluir algum item? s/n: ")
    val resp1 = readln()

    while (resp1 == "s" || resp1 == "S"){
        print("Qual iten deseja excluir: ")
        val sku = readln()
        if ( itens.contains(sku) ){
            itens.remove(sku)
            println()
            println("$sku excluído!")
            println()
            break
        }else if (sku == "sair" || sku == "Sair" || sku == "SAIR" ){
            break
        }
        else{
            println("O iten $sku não existe, digite um item válido, ou digite 'sair' para sair.")
        }

    }
}

fun atualizarItem(){
    print("Deseja atualizar algum item da lista? S/N: ")
    val resp2 = readln()

    while (resp2 == "s" || resp2 == "S"){
        print("Qual item deseja atualizar?: ")
        val sku = readln()
        if (itens.contains(sku)){
            val position = itens.indexOf(sku)
            print("Digite o novo item: ")
            itens[position] = readln()
            break
        }else if (sku == "sair" || sku == "Sair" || sku == "SAIR" ){
            break
        }else{
            println("O iten $sku não existe, digite um item válido, ou digite 'sair' para sair.")
        }

    }
}

fun exibirItens(){
    itens.forEach{
        println("*** $it ***")
    }
    println()
    println("Total de itens: ${itens.size}")
}