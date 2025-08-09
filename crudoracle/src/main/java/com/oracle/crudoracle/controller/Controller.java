package com.oracle.crudoracle.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oracle.crudoracle.service.Servico;
import com.oracle.crudoracle.entity.Usuario;


@RestController
@RequestMapping("/carros")
public class Controller {

    @Autowired
    private Servico serve;


    @GetMapping("/listar")
    public List<Usuario> listar() {
        return serve.ListarUsuarios();
    }

}
