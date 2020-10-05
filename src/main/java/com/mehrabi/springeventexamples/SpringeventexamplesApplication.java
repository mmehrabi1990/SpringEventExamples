package com.mehrabi.springeventexamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringeventexamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringeventexamplesApplication.class, args);
        //if you want to start context started event
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringeventexamplesApplication.class, args);
//        applicationContext.start();
    }

}
