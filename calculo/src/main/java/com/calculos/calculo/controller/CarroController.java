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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;









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
            return new ResponseEntity<String>("Coisa podre aki"+e,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Carro> find(@PathVariable long id){
        try {
            Carro carro = this.carroService.find(id);
            return new ResponseEntity<>(carro, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }

    
    @GetMapping("/findall")
    public ResponseEntity<List<Carro>> findall(){

        try {
            List<Carro> lista = this.carroService.findall();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }

      @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){

        try {
            String resultado= this.carroService.delete(id);
            return new ResponseEntity<>(resultado,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }

    }

    
    
       @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> update(@RequestBody Carro carro, @PathVariable Long id){
        try {
            String resultado= this.carroService.update(carro, id);
        return new ResponseEntity<>(resultado,HttpStatus.CREATED);
            
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }
    }

    




































































































}
