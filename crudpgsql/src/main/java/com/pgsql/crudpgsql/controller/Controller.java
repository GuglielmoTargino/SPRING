package com.pgsql.crudpgsql.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pgsql.crudpgsql.service.Servico;
import com.pgsql.crudpgsql.entity.Usuario;



@RestController
@RequestMapping("/usuarios")
public class Controller {

    @Autowired
    private Servico serve;


    @GetMapping("/listar")
    public List<Usuario> listar() {
      return serve.ListarUsuarios();
    }

}
