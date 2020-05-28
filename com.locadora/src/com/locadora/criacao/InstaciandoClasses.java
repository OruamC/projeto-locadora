package com.locadora.criacao;

import com.locadora.criacao.cliente.Cliente;
import com.locadora.criacao.dvds.Dvds;

import java.util.Scanner;

public class InstaciandoClasses {

    Scanner scanner = new Scanner(System.in);

    public Cliente criandoCliente() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = scanner.nextLine();
        Cliente novoCadastro = new Cliente(nome, cpf);
        return novoCadastro;
    }

    public Dvds criandoDvd() {
        System.out.print("Digite o nome do DVD: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu ano de lançamento: ");
        String anoDeLancamento = scanner.nextLine();
        Dvds novoDvd = new Dvds(nome, anoDeLancamento);
        return novoDvd;
    }

}
