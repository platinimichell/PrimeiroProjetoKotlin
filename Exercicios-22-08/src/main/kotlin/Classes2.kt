class aviao (
    var companhia: String,
    var nVoo: Int,
    var tipo: String
        ) {
    var aeroporto = ""
    var idade = 0
    var plano = 0

    constructor(
        companhia: String,
        nVoo: Int,
        tipo: String,
        aeroporto: String,
        idade: Int,
        plano: Int
    ) : this(companhia, nVoo, tipo) {
        this.aeroporto = aeroporto
        this.idade = idade
        this.plano = plano
    }

    fun voo() {
        print("Qual a companhia: ")
        readln()
        print("Qual número do vôo: ")
        var nVoo = readln().toInt()
        print("Qual tipo do vôo: ")
        var tipo = readln()
    }

    fun prioridades() {
        print("Qual sua idade: ")
        val idade = readln().toInt()
        println()
        if (idade <= 6 || idade >= 60) {
            println("Emabrque preferencial!")
        }

        while (idade in 6..60) {
            print("Verifique seu plano.")
            println()
            println()
            print("Qual seu plano ( 1) Comum, 2) Premium, 3) Diamante): ")
            val plano = readln().toInt()

            if (plano == 1) {
                println("Aguarde seu grupo ser chamado.")
                break
            } else if (plano == 2) {
                println("Seu grupo será o próximo a embarcar.")
                break
            } else if (plano == 3) {
                println("Emabrque preferencial!")
                break
            }

        }
    }
}