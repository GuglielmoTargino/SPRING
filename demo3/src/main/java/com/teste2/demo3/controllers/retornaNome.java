package com.teste2.demo3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Guga")
public class retornaNome {

    @GetMapping()
    public String Nome(){
        return "Guga legal 10";
    }

}
