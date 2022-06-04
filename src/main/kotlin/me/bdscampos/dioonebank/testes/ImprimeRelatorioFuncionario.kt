package me.bdscampos.dioonebank.testes

import me.bdscampos.dioonebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}