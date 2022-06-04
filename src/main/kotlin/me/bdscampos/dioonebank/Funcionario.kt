package me.bdscampos.dioonebank

import java.math.BigDecimal

class Funcionario(
    nome : String,
    cpf : String,
    val salario : BigDecimal
) : Pessoa(nome, cpf) {

}