package com.banking.SistemaBancario1.service;

import com.banking.SistemaBancario1.models.Conta;
import com.banking.SistemaBancario1.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaqueService {

    @Autowired
    private ContaRepository contaRepository;

    public String alterarQtdSaquesBanco(String numeroConta) {
        Optional<Conta> busca = contaRepository.findByNumeroConta(numeroConta);
        if (busca.isPresent()) {
            busca.map(map -> {
                map.setQuantidadeSaques(map.getQuantidadeSaques() != null ? map.getQuantidadeSaques() + 1 : 1);
                Conta updated = contaRepository.save(map);
                return ResponseEntity.ok().body(updated);
            });
            return"Salvo com sucesso"+ResponseEntity.ok().build();
        }
        return "Não salvou"+ResponseEntity.badRequest().build();
    }
}
