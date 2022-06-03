package me.bdscampos.dioonebank

data class Banco(
    val nome : String,
    val numero : Int
) {
    fun infoBanco() = "$nome - $numero"
}
