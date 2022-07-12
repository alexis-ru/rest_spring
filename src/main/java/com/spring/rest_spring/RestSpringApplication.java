package com.spring.rest_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RestSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSpringApplication.class, args);
    }

}
