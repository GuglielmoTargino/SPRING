package com.targino.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")
public class BuscaDados {



    @GetMapping
    public String buscar(){
        return "Olá Futuro!";
    }

}
