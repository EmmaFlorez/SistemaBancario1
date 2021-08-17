package com.banking.SistemaBancario1.repository;

import com.banking.SistemaBancario1.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaRepository extends JpaRepository<Conta, Integer> {

    Optional<Conta> findByNumeroConta(String numeroConta);
}
