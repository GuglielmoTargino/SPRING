package com.sqlser.crudsqlser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sqlser.crudsqlser.entity.Usuario;
import com.sqlser.crudsqlser.service.Servico;




@RestController
@RequestMapping("/usuarios")
public class Controller {

    @Autowired
    private Servico serve;


    // Listar 
    @GetMapping("/listar")
    public List<Usuario> listar() {
        return serve.ListarUsuarios();
    }

}
