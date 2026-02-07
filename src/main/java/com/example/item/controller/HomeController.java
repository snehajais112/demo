package com.example.item.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





    @RestController
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "Spring Boot Item API is running successfully on render!";
        }

        @GetMapping("/health")
        public String health() {
            return "Server is running fine!";
        }
    }


