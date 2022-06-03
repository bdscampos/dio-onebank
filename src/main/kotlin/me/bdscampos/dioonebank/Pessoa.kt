package me.bdscampos.dioonebank

class Pessoa {
    var nome: String = "Bruno"

    var cpf: String = "012.345.678-90"
    private set

    constructor()

    fun infoPessoa() = "${nome} e ${cpf}"
}

fun main() {
    val bruno = Pessoa()

    println(bruno.infoPessoa())
}
