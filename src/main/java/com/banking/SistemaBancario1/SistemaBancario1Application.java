package com.banking.SistemaBancario1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableKafka
public class SistemaBancario1Application {

    public static void main(String[] args)  {
        SpringApplication.run(SistemaBancario1Application.class, args);

    }
}


