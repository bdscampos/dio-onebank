package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}
