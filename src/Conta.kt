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