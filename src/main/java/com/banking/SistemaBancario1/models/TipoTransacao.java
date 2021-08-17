package com.banking.SistemaBancario1.models;

public enum TipoTransacao {

    SAQUE("Saque");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
