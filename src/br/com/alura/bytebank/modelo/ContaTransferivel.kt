package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {
    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (saldo >= valor) {
            saca(valor)
            contaDestino.deposita(valor)
            return true
        } else {
            return false
        }
    }
}