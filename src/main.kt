fun main() {

    println()
    println("Bem vindo ao Bytebank");
    println("________________")
//    testaComportamentoConta()

    val alex = Funcionario(
        nome = "Alex",
        cpf = "222.222.222-22",
        salario = 1100.0,

    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")
    println("________________")

    val fran = Gerente(
        nome = "Francielli",
        cpf = "111.111.111-11",
        salario = 2100.0,
        senha = 1234

        )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario: ${fran.salario}")
    println("bonificação: ${fran.bonificacao}")
    println("autenticação:  ${fran.autentica(1234)}")
    println("________________")
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
    if(gui.autentica(4000)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
    println("________________")


}


