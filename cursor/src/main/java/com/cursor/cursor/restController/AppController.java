package com.cursor.cursor.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/auth")
public class AppController {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello";
    }
}
