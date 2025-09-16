package com.pjt8sembck2.pjt8sembck2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.pjt8sembck2.pjt8sembck2.entity.Alugado;
import com.pjt8sembck2.pjt8sembck2.entity.Carro;
import com.pjt8sembck2.pjt8sembck2.service.CarroService;

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
    //public ResponseEntity<String> save(@RequestBody Alugado carro){
        public ResponseEntity<String> save(@RequestBody Carro carro){
        try {
            //String mensagem = this.carroService.savealug(carro);
            String mensagem = this.carroService.save(carro);
            return new ResponseEntity<String>(mensagem,HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>("Coisa podre aki"+e,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }

    @GetMapping("/find/{id}")
    //public ResponseEntity<Alugado> find(@PathVariable long id){
        public ResponseEntity<Carro> find(@PathVariable long id){
        try {
            //Alugado carro = this.carroService.findalug(id);
            Carro carro = this.carroService.find(id);
            return new ResponseEntity<>(carro, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
            // TODO: handle exception
        }
    }

    
    @GetMapping("/findall")
    //public ResponseEntity<List<Alugado>> findall(){
        public ResponseEntity<List<Carro>> findall(){

        try {
           // List<Alugado> lista = this.carroService.findallalug();
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
            //String resultado= this.carroService.deletealug(id);
            String resultado= this.carroService.delete(id);
            return new ResponseEntity<>(resultado,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }

    } 

    @PutMapping("/atualizar/{id}")
    //public ResponseEntity<String> update(@RequestBody Alugado carro, @PathVariable Long id){
        public ResponseEntity<String> update(@RequestBody Carro carro, @PathVariable Long id){
        try {
            //String resultado= this.carroService.updatealug(carro, id);
            String resultado= this.carroService.update(carro, id);
        return new ResponseEntity<>(resultado,HttpStatus.CREATED);
            
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
         }
    }
////////// alugar aqui


    @DeleteMapping("/aluga/{id}") 
    
        public ResponseEntity<String> alugar(@RequestBody Carro carro,@PathVariable Long id){
            //public ResponseEntity<String> devolve(@PathVariable Long id){

        try {
           
            String resultado= this.carroService.alugar(carro,id);
            //String resultado= this.carroService.deletealug(id);
            return new ResponseEntity<>(resultado,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }
    }

////////////////////////////////endpoint Alugadocomponent aqui 

   
    @DeleteMapping("/devolve/{id}") 
    
        public ResponseEntity<String> devolve(@RequestBody Alugado carro,@PathVariable Long id){
            //public ResponseEntity<String> devolve(@PathVariable Long id){

        try {
           
            String resultado= this.carroService.deletealug(carro,id);
            //String resultado= this.carroService.deletealug(id);
            return new ResponseEntity<>(resultado,HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>("null",HttpStatus.BAD_REQUEST);
        }
    }

     @GetMapping("/findallalug")
     public ResponseEntity<List<Alugado>> findallalug(){
        ///public ResponseEntity<List<Carro>> findall(){

        try {
            List<Alugado> lista = this.carroService.findallalug();
            //List<Carro> lista = this.carroService.findall();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
        }
    }


}
