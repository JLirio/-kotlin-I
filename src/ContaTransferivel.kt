abstract class ContaTransferivel(
    titular: String,
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