package com.example.springbootdemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    private static final String template = "Hello, %s! This page is produced using a REST API! This is JSON.";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greet")
    public Greet greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greet(counter.incrementAndGet(), String.format(template, name));
    }
}
