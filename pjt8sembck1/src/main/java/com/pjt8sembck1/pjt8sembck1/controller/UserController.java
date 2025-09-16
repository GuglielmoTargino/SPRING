package com.pjt8sembck1.pjt8sembck1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.pjt8sembck1.pjt8sembck1.entity.Usuario;
import com.pjt8sembck1.pjt8sembck1.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;

/* 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
*/


@RestController
@RequestMapping("/carro")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService useserve;

    @PostMapping("/login")
public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
    Usuario user = useserve.autenticar(usuario.getNomeusu(), usuario.getSenha());
    return user != null ? ResponseEntity.ok(user) : ResponseEntity.status(401).build();
}



}
