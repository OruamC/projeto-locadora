package com.locadora.locacao;

import com.locadora.criacao.cliente.Cliente;
import com.locadora.criacao.dvds.Dvds;
import com.locadora.operacao.relatorio.Relatorio;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class InstaciandoAluguel {

    Scanner scanner = new Scanner(System.in);

    public Aluguel locacaoDvd(List<Cliente> listaCliente, List<Dvds> listaDvds){
        System.out.println("\n---------------------------------------------\n");
        boolean validacao = false;
        int contagem = 0;
        for (Dvds dvds: listaDvds) {
            System.out.println("[" + contagem + "] " +dvds.getNomeDoDvd());
            contagem++;
        }
        System.out.print("Digite a opção de filme que deseja: ");
        int filmeEscolhido = scanner.nextInt();
        scanner.nextLine();

        contagem = 0;
        for (Cliente cliente : listaCliente) {
            System.out.println("[" + contagem + "] " +cliente.getNome());
            contagem++;
        }
        System.out.print("Digite qual cliente esta realizando a locação: ");
        int clienteEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por quantos dias deseja ficar com a locação? ");
        int quantidadeDias = scanner.nextInt();
        LocalDate agora = LocalDate.now();
        Aluguel novoAluguel = new Aluguel(agora, quantidadeDias, listaCliente.get(clienteEscolhido),
                listaDvds.get(filmeEscolhido));

        Relatorio relatorio = new Relatorio();
        relatorio.relatorioDeLocacao(novoAluguel);

        return novoAluguel;
    }
}
