package com.locadora.operacao.pesquisa;

import com.locadora.criacao.cliente.Cliente;

import java.util.List;
import java.util.Scanner;

public class Pesquisa {

    Scanner scanner = new Scanner(System.in);

    public boolean pesquisaNomeCliente (List<Cliente> listaClientes, String nome) {
        boolean teste = false;
        for (Cliente cliente : listaClientes) {
            teste = cliente.getNome().toLowerCase().equals(nome);
            if (teste) {
                int detalhes = 0;
                while (detalhes < 1 || detalhes > 2) {
                    System.out.print("Cliente encontrado, gostaria de ver os detalhes? [1 - Sim / 2 - Não]: ");
                    detalhes = scanner.nextInt();
                }
                if (detalhes == 1){
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    break;
                } else {
                    break;
                }
            }
        }
        return teste;
    }
}
