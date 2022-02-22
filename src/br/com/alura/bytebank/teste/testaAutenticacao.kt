import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.00,
        senha = 1234
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 4321,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Joao",
        cpf = "333.333.333-33",
        senha = 1212,

    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1234)
    sistema.entra(diretora,4321)
    sistema.entra(cliente, 1212)
}