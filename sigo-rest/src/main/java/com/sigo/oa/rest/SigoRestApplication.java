package com.sigo.oa.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sigo.oa"})
public class SigoRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SigoRestApplication.class, args);
    }
}
