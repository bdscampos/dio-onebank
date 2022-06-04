package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.Funcionario
import java.math.BigDecimal

fun main() {
    val bruno = Funcionario(nome = "Bruno", cpf = "123.456.789-00", salario = BigDecimal.valueOf(1000.0))
}