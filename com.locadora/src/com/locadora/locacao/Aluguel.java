package com.locadora.locacao;

import com.locadora.criacao.cliente.Cliente;
import com.locadora.criacao.dvds.Dvds;

import java.time.LocalDate;
import java.time.Period;

public class Aluguel {

    private LocalDate dataDeLocacao;
    private LocalDate dataDeDevolucao;
    private int quantidadeDias;
    Cliente cliente;
    Dvds dvdLocado;
    Double valorTotal;

    public Aluguel(LocalDate dataDeLocacao, Integer quantidadeDias, Cliente cliente, Dvds dvdLocado) {
        this.dataDeLocacao = dataDeLocacao;
        this.quantidadeDias = quantidadeDias;
        this.cliente = cliente;
        this.dvdLocado = dvdLocado;
    }

    public LocalDate getDataDeLocacao() {
        return dataDeLocacao;
    }

    public void setDataDeLocacao(LocalDate dataDeLocacao) {
        this.dataDeLocacao = dataDeLocacao;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public Integer getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(Integer quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Dvds getDvdLocado() {
        return dvdLocado;
    }

    public void setDvdLocado(Dvds dvdLocado) {
        this.dvdLocado = dvdLocado;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void devolucao(LocalDate dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
        Period periodo = Period.between(this.dataDeLocacao, dataDeDevolucao);
        boolean validacao = periodo.getDays() > this.quantidadeDias;
        if (validacao){
            this.valorTotal = this.quantidadeDias * 5.0 * 1.10;
        } else {
            this.valorTotal = periodo.getDays() * 5.0;
        }
    }
}
