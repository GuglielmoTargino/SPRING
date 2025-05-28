package com.crudweb.crudcrud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudweb.crudcrud.entity.Carro;
import com.crudweb.crudcrud.service.CarroService;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroservice;


    @PostMapping("/save")
      public ResponseEntity<String> save(@RequestBody Carro carro){
      try {
        String resultado= this.carroservice.save(carro);
        return new ResponseEntity<>(resultado,HttpStatus.CREATED);
      } catch (Exception e) {
        // TODO: handle exception
        return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
      }
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> update(@RequestBody Carro carro, @PathVariable Long id){
        try {
            String resultado= this.carroservice.update(carro, id);
        return new ResponseEntity<>(resultado,HttpStatus.CREATED);
            
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        try {
            String resultado= this.carroservice.delete(id);
            return new ResponseEntity<>(resultado,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }

    }

    
    @GetMapping("/buscar")
    public ResponseEntity<List<Carro>> findall(){

        try {
            List<Carro> lista = this.carroservice.findall();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/buscar/{id}")

    public ResponseEntity<Carro> findById(@PathVariable Long id){

        try {
            Carro carro = this.carroservice.findById(id);
            return new ResponseEntity<>(carro,HttpStatus.OK);
            
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }

    }






}
