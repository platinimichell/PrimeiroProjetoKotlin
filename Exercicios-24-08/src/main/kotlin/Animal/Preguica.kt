package Animal

class Preguica(
    nome: String,
    idade: Int,
    val ehFamosa: Boolean): Animal(nome,idade) {
    override fun emitirSom() {
        println("Um barulho estranho.")
    }

    override fun subirEmArvore() {
        super.subirEmArvore()
    }

    override fun toString(): String {
        return "Nome: $nome\n" +
                "Idade: $idade\n"
    }
}