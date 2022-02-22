package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {

    var saldo = 0.0
        protected set


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)



//    fun getSaldo(): Double{
//        return saldo
//    }
//    fun setSaldo(valor: Double){
//        saldo = valor
//    }
}