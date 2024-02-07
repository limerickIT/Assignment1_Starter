package com.global_beer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.global_beer.model")
public class Assignment1StarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(Assignment1StarterApplication.class, args);
    }

}
