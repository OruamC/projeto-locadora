package com.locadora.criacao.dvds;

public class Dvds {

    private String nomeDoDvd;
    private String anoDeLancamento;

    public String getNomeDoDvd() {
        return nomeDoDvd;
    }

    public void setNomeDoDvd(String nomeDoDvd) {
        this.nomeDoDvd = nomeDoDvd;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public Dvds(String nomeDoDvd, String anoDeLancamento) {
        this.nomeDoDvd = nomeDoDvd;
        this.anoDeLancamento = anoDeLancamento;
    }
}
