package com.targino.cadastro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.targino.cadastro.servicos.MostrarDados;
import com.targino.cadastro.users.Users;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/dados")
public class BuscaDados {
    private MostrarDados xy;

    public BuscaDados(MostrarDados y){
        this.xy=y;
    }



    @GetMapping
    public String buscar(){
        return xy.informarDados("guga");
    }

    @PostMapping("/{id}")   
    public String postar(@PathVariable String id,@RequestParam String filter,@RequestBody Users nom){

        return "Dados postados"+filter;

    }

}
