package com.fpmislata.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BookController {

    @GetMapping("/")
    public void index() {
        System.out.println("Método de index del controlador");
    }

    @GetMapping("/about")
    public void about() {
        System.out.println("Método de about del controlador");
    }

    // get all
    
}
