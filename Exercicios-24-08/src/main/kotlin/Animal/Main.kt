package Animal

fun main(){

    val cachorro = Cachorro("Caramelo", 5,"Caramelo")

    val cavalo = Cavalo("Pé de pano", 8, "Puro sangue",true )

    val preguica = Preguica("Sid", 8, true)

    print(cachorro)
    cachorro.emitirSom()
    cachorro.correr()

    println()

    print(cavalo)
    cavalo.emitirSom()
    cavalo.correr()

    println()

    print(preguica)
    preguica.emitirSom()
    preguica.subirEmArvore()

}