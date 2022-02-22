import br.com.alura.bytebank.modelo.*


fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "", senha = 1),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 3),
        numero = 1000
    )
    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Gui", cpf = "", senha = 2),
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaSalario.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")
    println("_____________________")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")
    println("_____________________")

    contaCorrente.transfere(100.0, contaSalario)
    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)
    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
    println("_____________________")
}