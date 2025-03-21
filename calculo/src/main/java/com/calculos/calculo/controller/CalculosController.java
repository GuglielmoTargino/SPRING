package com.calculos.calculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculos.calculo.entity.Resultado;
import com.calculos.calculo.entity.Entrada;
import com.calculos.calculo.service.CalculosService;

@RestController
@RequestMapping("/calculos")
public class CalculosController {

    @Autowired
    private CalculosService calculosService;

    @GetMapping("/somar")
    public ResponseEntity<Resultado> somar( @RequestBody Entrada entrada){

        try {
            Resultado resultado = this.calculosService.somar(entrada);
            return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
            
        } catch (Exception e) {
            // TODO: handle exception

            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
        
    }

}
