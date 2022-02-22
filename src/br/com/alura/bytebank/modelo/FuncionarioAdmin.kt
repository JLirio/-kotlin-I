package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
   protected val senha: Int,

    ) : Funcionario(
    nome = nome,
    salario = salario,
    cpf = cpf
) {

     fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false

    }


}