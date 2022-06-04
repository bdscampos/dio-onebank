package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.Analista
import me.bdscampos.dioonebank.Funcionario
import me.bdscampos.dioonebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria do Carmo", cpf = "098.765.432-10", salario = 3000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

