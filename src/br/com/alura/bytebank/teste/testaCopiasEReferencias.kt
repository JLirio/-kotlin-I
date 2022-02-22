import br.com.alura.bytebank.modelo.*

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println(numeroY)

    val joao = Cliente(nome = "Joao", cpf = "", senha = 3)
    val contaJoao = ContaPoupanca(joao, 20880)

    val maria = Cliente(nome = "Maria", cpf="" , senha = 4)
    val contaMaria = ContaCorrente(maria,48884)


    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

}