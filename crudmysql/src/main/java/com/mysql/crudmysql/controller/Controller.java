package com.mysql.crudmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.crudmysql.entity.Carro;
import com.mysql.crudmysql.service.Servico;

@RestController
@RequestMapping("/carros")
public class Controller {

    @Autowired
    private Servico serve;


    @GetMapping("/listar")
    public List<Carro> listar(){
        return serve.ListarCarros();
    }

    @PostMapping
    public String salvar(@RequestBody Carro carro) {
        serve.SalvarCarros(carro);
        return "Carro salvo com sucesso!";
    }




}





