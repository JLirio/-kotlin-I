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