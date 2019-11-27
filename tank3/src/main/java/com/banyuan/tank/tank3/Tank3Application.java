package com.banyuan.tank.tank3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Tank3Application {

    public static void main(String[] args) {
        SpringApplication.run(Tank3Application.class, args);
    }

}
