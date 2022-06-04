package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.Analista
import me.bdscampos.dioonebank.Funcionario

fun main() {
    val bruno = Analista(nome = "Bruno Campos", cpf = "123.456.789-00", salario = 1000.0)
    ImprimeRelatorioFuncionario.imprime(bruno)
}

