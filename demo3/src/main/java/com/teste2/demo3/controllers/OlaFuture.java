package com.teste2.demo3.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste2.demo3.service.OlaMundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/olafuturo")

public class OlaFuture {

    private OlaMundo xy;

    public OlaFuture(OlaMundo mundo){
        this.xy=mundo;
    }

    @GetMapping()    
    
    public String olafuture(){

        return xy.olamundo("Guga avança!");
    }

    @PostMapping
    public void criaNome(@RequestBody retornaNome x){

        System.out.println(x.getNome());
        System.out.println(x.getIdade());
    }

}

