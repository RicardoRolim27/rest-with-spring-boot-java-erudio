package br.com.ricardorolim.controllers;


import br.com.ricardorolim.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "world")
            String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting;
    }
}
