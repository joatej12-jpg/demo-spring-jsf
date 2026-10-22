package com.ejemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.joinfaces.autoconfigure.javaxfaces.JsfBeansAutoConfiguration;

@SpringBootApplication(exclude = {JsfBeansAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}