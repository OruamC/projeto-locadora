package com.locadora.teste;

import com.locadora.criacao.InstaciandoClasses;
import com.locadora.criacao.cliente.Cliente;
import com.locadora.criacao.dvds.Dvds;
import com.locadora.locacao.Aluguel;
import com.locadora.locacao.InstaciandoAluguel;
import com.locadora.operacao.pesquisa.Pesquisa;
import com.locadora.operacao.relatorio.Relatorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        Relatorio relatorio = new Relatorio();
        InstaciandoClasses novaClasse = new InstaciandoClasses();
        InstaciandoAluguel novoAluguel = new InstaciandoAluguel();
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DecimalFormat decimalFormat = new DecimalFormat("R$ #,###.00");

//        var harryPotter = new Dvds("Harry Potter", "2005");
//        var primeiroCliente = new Cliente("Oruam", "426800");
//
//        var primeiraLocacao = new Aluguel(dataAtual, 3, primeiroCliente, harryPotter);
//
//        LocalDate dataDevolucao = LocalDate.of(2020, 5, 29);
//
//        primeiraLocacao.devolucao(dataDevolucao);
//        relatorio.impressaoRelatorio(primeiraLocacao);

        Scanner scanner = new Scanner(System.in);
        int opcao = 10;
        int i = 0;
        List<Cliente> listaClientes = new ArrayList<>();
        List<Dvds> listaDvds = new ArrayList<>();
        List<Aluguel> listaAluguel = new ArrayList<>();


        while (opcao != 0){
            System.out.println("-----------------------------------");
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("[0] ----> Sair");
            System.out.println("[1] ----> Cadastrar Cliente");
            System.out.println("[2] ----> Cadastrar DVD");
            System.out.println("[3] ----> Pesquisar um cliente");
            System.out.println("[4] ----> Realizar um aluguel");
            do {
                System.out.print("Digite a sua opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
            } while (opcao < 0 || opcao > 4);

            switch (opcao){
                case 0:
                    System.out.println("Obrigado por escolher nossos serviços. Volte sempre!");
                    break;
                case 1:
                    listaClientes.add(novaClasse.criandoCliente());
                    System.out.println("Você cadastrou um cliente novo.");
                    break;
                case 2:
                    listaDvds.add(novaClasse.criandoDvd());
                    System.out.println("Você cadastrou um novo DVD.");
                    break;
                case 3:
                    System.out.print("Digite o nome que gostaria de pesquisar: ");
                    String nomePesquisa = scanner.nextLine();
                    Pesquisa novaPesquisa = new Pesquisa();
                    boolean verificacao = novaPesquisa.pesquisaNomeCliente(listaClientes, nomePesquisa);
                    if (!verificacao){
                        System.out.println("Cliente não encontrado.");
                    }
                    break;
                case 4:
                    if (listaClientes.isEmpty()){
                        System.out.println("Não existe clientes cadastrados. Favor realizar o cadastro primeiro!");
                        break;
                    } else if (listaDvds.isEmpty()) {
                        System.out.println("Não existe filmes cadastrados. Favor realizar o cadastro primeiro!");
                        break;
                    }
                    listaAluguel.add(novoAluguel.locacaoDvd(listaClientes, listaDvds));
                    break;
            }
        }
    }
}
