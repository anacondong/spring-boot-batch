package com.javainuse;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchApplication {

    // http://www.javainuse.com/spring/springbatch
    // http://localhost:8080/invokejob
    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }
}
