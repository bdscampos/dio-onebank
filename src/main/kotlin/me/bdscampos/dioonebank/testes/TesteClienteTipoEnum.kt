package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }
}