package com.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryApplication {

    /**
     * Application entry point; bootstraps the Spring context and starts the embedded web server.
     */
    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }
}
