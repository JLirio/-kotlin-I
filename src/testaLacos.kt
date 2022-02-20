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