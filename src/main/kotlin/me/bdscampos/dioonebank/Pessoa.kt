package me.bdscampos.dioonebank

class Pessoa {
    var nome: String = "Bruno"

    var cpf: String = "012.345.678-90"
    private set
}

fun main() {
    val bruno = Pessoa()

    println(bruno.nome)
    println(bruno.cpf)
}
