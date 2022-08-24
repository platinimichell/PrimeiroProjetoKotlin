package Animal

abstract class Animal (
    val nome: String,
    val idade: Int,

        ){
    abstract fun emitirSom()
    open fun correr(){
        println("Correndo")
    }

    open fun subirEmArvore(){
        println("Subindo em árvores")
    }
}