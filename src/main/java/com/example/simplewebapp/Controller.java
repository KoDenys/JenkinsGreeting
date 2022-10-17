package com.example.simplewebapp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
public class Controller {

    private final Greeting greeting;

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String getGreeting(@PathVariable String name) {
        return greeting.greeting(name);
    }
}
