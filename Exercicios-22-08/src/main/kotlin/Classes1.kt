/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

class cliente (
    val nome: String,
    val cnpj: Int,
    val endereco: String,
    val rede: String,
) {
    var tabela = 0.0
    var pesoMin = 0
    var imposto = 0.0
    var cotacao = 0.0

    constructor(
        nome: String,
        cnpj: Int,
        endereco: String,
        rede: String,
        tabela: Double,
        pesoMin: Int,
        imposto: Double
    ):this(nome, cnpj, endereco, rede){
        this.tabela = tabela
        this.pesoMin = pesoMin
        this.imposto = imposto
    }

    fun addCliente(){
        print("Digite razão social: ")
        val nome = readln()
        print("Digite CNPJ (somente números): ")
        val cnpj = readln().toInt()
        print("Digite o endereço: ")
        val endereco = readln()
        print("Digite a rede de lojas a qual pertence: ")
        val rede = readln()

        println("Cliente $nome cadastrado com sucesso!")

    }

    fun frete(){

        println()
        print("Qual peso da carga: ")
        val pesoMin = readln().toInt()

        print("Qual tabela de frete: ")
        val tabela = readln().toDouble()

        print("Qual a % de imposto da UF do destinatário (12% ou 7%): ")
        val imposto = readln().toDouble()

        if ( pesoMin <= 100 ){
            val cotacao = (100 * tabela) / (imposto / -100 + 1)
            println("O valor do frete é R$$cotacao")
        }else{
            val cotacao = (pesoMin * tabela) / (imposto / -100 + 1)
            println("O valor do frete é R$$cotacao")
        }

    }

}