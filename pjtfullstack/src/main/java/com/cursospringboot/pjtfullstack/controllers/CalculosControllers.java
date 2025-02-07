package com.cursospringboot.pjtfullstack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cursospringboot.pjtfullstack.entities.Entrada;
import com.cursospringboot.pjtfullstack.entities.Resultados;
import com.cursospringboot.pjtfullstack.services.CalculosServices;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/calculos")

public class CalculosControllers {

    @Autowired
    private CalculosServices calculoservice;
    //private CalculosServices calculoservice=new CalculosServices();


    @GetMapping
    public ResponseEntity<Resultados> somo(Entrada entrada){

        try {

            Resultados resultado=this.calculoservice.somo(entrada);
            return new ResponseEntity< Resultados>(resultado,HttpStatus.OK);
            
        } catch (Exception e) {

            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }

    }

}
