package Animal

class Cavalo(
    nome: String,
    idade: Int,
    val raca: String,
    val ehDeCorrida: Boolean): Animal(nome, idade) {



    override fun emitirSom() {
        println("Relinchando.")
    }

    override fun correr() {
        print("Correndo rapído.\n")
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n" +
                "Raça: $raca\n"
    }
}