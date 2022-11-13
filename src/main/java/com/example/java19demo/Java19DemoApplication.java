package com.example.java19demo;

import com.example.java19demo.components.ConcurrencyFeatureComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class Java19DemoApplication {

    @Autowired
    static
    ConcurrencyFeatureComponent concurrencyFeatureComponent;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SpringApplication.run(Java19DemoApplication.class, args);

        concurrencyFeatureComponent.handle();
    }

}
