package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.Cliente
import me.bdscampos.dioonebank.ClienteTipo

fun main() {
    val thais = Cliente(nome = "Thais Campos", cpf = "456.789.123-45", clienteTipo = ClienteTipo.PF, senha = "123456")
    println(thais)

    TesteAutenticacao().autentica(thais)
}


