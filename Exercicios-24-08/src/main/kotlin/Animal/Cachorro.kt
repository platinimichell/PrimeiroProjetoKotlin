package Animal

class Cachorro(
    nome: String,
    idade: Int,
    val raca: String): Animal(nome, idade) {

    override fun emitirSom() {
        println("Latindo")
    }

    override fun correr() {
        println("correndo atrás do motoboy")
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n" +
                "Raça: $raca"
    }
}