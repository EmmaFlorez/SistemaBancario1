package com.banking.SistemaBancario1.kafka;

import com.banking.SistemaBancario1.service.SaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class ListeningKafka {

   @Autowired
    private SaqueService saqueService;


    @KafkaListener(topics = "BANK_NEW_ORDER_WITHDRAW", groupId = "BANK_NEW_ORDER_WITHDRAW")
    @SendTo
    public String listen(String numeroConta){
        String uuid = saqueService.alterarQtdSaquesBanco(numeroConta);
        System.out.println("------------------");
        System.out.println("NEW ORDER WITHDRAW");
        System.out.println("Adding +1 withdrawal to the database");
        System.out.println("-------------------");
        return "salvo" + uuid ;
    }


}
