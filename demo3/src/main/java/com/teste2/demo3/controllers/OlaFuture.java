package com.teste2.demo3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@Controller
@ResponseBody
@RequestMapping("/olafuturo")

public class OlaFuture {

    @GetMapping()    
    
    public String olafuture(){

        return "Olá Futuro! Cheguei!";
    }

}
