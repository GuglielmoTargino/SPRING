package com.oracle.crudoracle.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oracle.crudoracle.service.Servico;
import com.oracle.crudoracle.entity.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/usuarios")
public class Controller {

    @Autowired
    private Servico serve;


    @GetMapping("/listar")
    public List<Usuario> listar() {
        return serve.ListarUsuarios();
    }

    @PostMapping("salvar")
    public String salvar(@RequestBody Usuario usuario) {
        serve.SalvarUsuarios(usuario);
        return "Usuario salvo com sucesso!";
    }

}

