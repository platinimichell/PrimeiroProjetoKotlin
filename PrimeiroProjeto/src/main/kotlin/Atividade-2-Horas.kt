fun main() {

    val HoraExtra = 20
    val CargaHoraria = 50
    val HoraNormal = 10
    //val Excesso = HorasTrabalhadas - CargaHoraria

    print("Qual código do trabalhador: ")
    var Cod = readln()!!.toInt()
    print("Qual número de horas trabahadas?: ")
    var HorasTrabalhadas = readln()!!.toInt()

    println("O operário código $Cod trabalhou $HorasTrabalhadas horas.")

    if(HorasTrabalhadas > CargaHoraria){
        println("Este funcionário receberá ${HorasTrabalhadas - CargaHoraria} horas extras.")
        var Exc = HorasTrabalhadas - CargaHoraria
        println("O pagamento semanal é de R$${HoraNormal * HorasTrabalhadas}, e R$${Exc * HoraExtra} de horas extras, totalizando R$${(HoraNormal*HorasTrabalhadas)+(Exc*HoraExtra)}.")
    }
    else{
        print("Não houve hora extra, o pagamento semanal é de R$${HorasTrabalhadas * HoraNormal}")
    }





}