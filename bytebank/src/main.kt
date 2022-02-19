class Conta(
    var titular: String,
    val numero :Int) {
    
    var saldo = 0.0
           private set


    fun deposita(valor: Double) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saca(valor)
            contaDestino.deposita(valor)
            return true
        } else {
            return false
        }
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        saldo = valor
//    }
}

fun main() {

    println()
    println("Bem vindo ao Bytebank");
    println("________________")
    val contaAlex = Conta("Alex", 1001)
    contaAlex.deposita(300.0)

    val contaFran = Conta("Fran", 1000)
    contaFran.deposita(200.0)

    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.saldo);
    println("________________")

    println(contaFran.titular);
    println(contaFran.numero);
    println(contaFran.saldo);

    println("________________")
    println("depositado na conta do Alex:")
    contaAlex.deposita(1000.0)
    println(contaAlex.saldo)
    println("depositado na conta do Fran:")
    contaFran.deposita(600.0)
    println(contaFran.saldo)

    println("_______________________")
    println("saque na conta do Fran:")
    contaFran.saca(400.0)
    println(contaFran.saldo)
    println("saque  na conta do Alex:")
    contaAlex.saca(400.0)
    println(contaAlex.saldo)

    println("_______________________")
    println("Tranferencia na conta da Fran para o Alex:")

    if (contaAlex.transfere(300.0, contaFran)) {
        println("Transferencia bem sucedida!")
    } else {
        println("Falha na transferencia!!!")
    }
    println(contaFran.saldo)
    println(contaAlex.saldo)


}


fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroY)

    val contaJoao = Conta("João", 20880)

    val contaMaria = Conta("Maria",48884)


    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta negativada")
    }

    when {
        saldo > 0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta negativada")

    }
}

fun testaLacos() {
    for (i in 5 downTo 1) {

        val titular: String = "Alex $i"
        val numeroConta = 1000
        var saldo = 0.0
        saldo += i.toDouble()


        println("___________________")
        println("titular $titular")
        println()
        println("numero da conta  $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)

    }
    for (i in -5..-1) {

        val titular: String = "Alex $i"
        val numeroConta = 1000
        var saldo = 0.0
        saldo += i.toDouble()


        println("___________________")
        println("titular $titular")
        println()
        println("numero da conta  $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)

    }
    for (i in 10 downTo 0 step 2) {

        val titular: String = "Alex $i"
        val numeroConta = 1000
        var saldo = 0.0
        saldo += i.toDouble()


        println("___________________")
        println("titular $titular")
        println()
        println("numero da conta  $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)

    }

}