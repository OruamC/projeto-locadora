package com.locadora.operacao.relatorio;

import com.locadora.locacao.Aluguel;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Relatorio implements Impressao {

        DecimalFormat df = new DecimalFormat("R$ #,###.00");
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void impressaoRelatorio(Aluguel aluguel) {
        System.out.println("---------------------------------------------\n");
        System.out.println("Nome: " + aluguel.getCliente().getNome());
        System.out.println("Filme locado: " + aluguel.getDvdLocado().getNomeDoDvd());
        System.out.println("Locado no dia: " + formatador.format(aluguel.getDataDeLocacao()));
        System.out.println("Devolvido no dia: " + formatador.format(aluguel.getDataDeDevolucao()));
        System.out.println("Totalizando: " + df.format(aluguel.getValorTotal()));
    }

    public void relatorioDeLocacao(Aluguel aluguel){
        System.out.println("---------------------------------------------\n");
        System.out.println("Locação realizada com sucesso ao " + aluguel.getCliente().getNome());
        System.out.println("Filme escolhido: " + aluguel.getDvdLocado().getNomeDoDvd());
        System.out.println("Data da locação: " + formatador.format(aluguel.getDataDeLocacao()));
        System.out.println("Data máxima para devolução: " + formatador.format(aluguel.getDataDeLocacao().plusDays(aluguel.getQuantidadeDias())));
    }
}
