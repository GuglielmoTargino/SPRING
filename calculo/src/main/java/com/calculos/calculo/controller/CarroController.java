package com.calculos.calculo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.calculos.calculo.entity.Carro;
import com.calculos.calculo.service.CarroService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/carro")
@CrossOrigin("*")
public class CarroController {
    @Autowired
    private CarroService carroService;    
 
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Carro carro){
        try {
            String mensagem = this.carroService.save(carro);
            return new ResponseEntity<String>(mensagem,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Coisa podre aki",HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Carro> find(@PathVariable int id){
        try {
            Carro carro = this.carroService.find(id);
            return new ResponseEntity<>(carro, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }
}
