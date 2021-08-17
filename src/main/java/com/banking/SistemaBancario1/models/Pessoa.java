package com.banking.SistemaBancario1.models;

public enum Pessoa {

    FISICA("FISICA", 5, 10.0), JURIDICA("JURIDICA", 50, 10.0), GOVERNAMENTAL("GOVERNAMENTAL", 250, 20.0);

    private String descricao;
    private Integer quantidadeSaques;
    private double taxa;

    Pessoa(String descricao) {
        this.descricao = descricao;
    }

    public double getTaxa() {
        return taxa;
    }

    Pessoa(String descricao, Integer quantidadeSaques, double taxa) {
        this.descricao = descricao;
        this.quantidadeSaques = quantidadeSaques;
        this.taxa = taxa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidadeSaques() {
        return quantidadeSaques;
    }

    public static Pessoa getByTipoConta(String tipoconta){
        if (Pessoa.FISICA.getDescricao().equalsIgnoreCase(tipoconta)) {
            return Pessoa.FISICA;
        } else if (Pessoa.JURIDICA.getDescricao().equalsIgnoreCase(tipoconta)) {
            return Pessoa.JURIDICA;
        } else if (Pessoa.GOVERNAMENTAL.getDescricao().equalsIgnoreCase(tipoconta)) {
            return Pessoa.GOVERNAMENTAL;
        }
        return null;
    }
}
