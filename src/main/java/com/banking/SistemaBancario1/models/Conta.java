package com.banking.SistemaBancario1.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;


@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @Length(max = 4)
    private String agencia;

    @Column ( name = "digito_verificador", nullable = false)
    @Length(max = 2)
    private String digitoVerificador;

    @Column(name = "tipo_conta")
    private String tipoConta;

    @Column(name = "numero_conta",nullable = false, unique = true)
    @Length(max = 5)
    private String numeroConta;

    @Column(name = "cpf_cnpj_cg", nullable = false)
    private String cpfCnpjCg;

    @Column
    private Double saldo = 0.0;

    @Column
    private Integer quantidadeSaques;

    public Conta(Integer quantidadeSaques,String agencia, String digitoVerificador, String numeroConta, String cpfCnpjCg, Double saldo) {
        this.agencia = agencia;
        this.digitoVerificador = digitoVerificador;
        this.numeroConta = numeroConta;
        this.cpfCnpjCg = cpfCnpjCg;
        this.saldo = saldo;
        this.quantidadeSaques = quantidadeSaques;

    }

    public Conta() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(String digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getCpfCnpjCg() {
        return cpfCnpjCg;
    }

    public void setCpfCnpjCg(String cpfCnpjCg) {
        this.cpfCnpjCg = cpfCnpjCg;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getQuantidadeSaques() {
        return quantidadeSaques;
    }

    public void setQuantidadeSaques(Integer quantidadeSaques) {
        this.quantidadeSaques = quantidadeSaques;
    }
}
