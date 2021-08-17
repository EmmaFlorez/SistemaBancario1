package com.banking.SistemaBancario1.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacao")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private double valor ;

    @Column
    private String numeroConta;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private TipoTransacao tipoTransacao;

    private Double taxa;

    @Column
    private LocalDateTime data;

    public Transacao(Double valor, String numeroConta, TipoTransacao tipoTransacao){
        this();
        this.valor = valor;
        this.numeroConta = numeroConta;
        this.tipoTransacao = tipoTransacao;
    }

    public Transacao() {
        data = LocalDateTime.now();
    }

    public Transacao(Double valor, String numeroConta, TipoTransacao tipoTransacao, Double taxa) {
        this.valor = valor;
        this.numeroConta = numeroConta;
        this.tipoTransacao = tipoTransacao;
        this.taxa = taxa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}





