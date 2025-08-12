package com.pgsql.crudpgsql.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

     //Sallvar
    @PostMapping("salvar")
    public String salvar(@RequestBody Usuario usuario) {
        serve.SalvarUsuarios(usuario);
        return "Usuario salvo com sucesso!";
    }

    // DELETE - excluir pela senha
    @DeleteMapping("/deletar/{idh}")
    public String deletar(@PathVariable Long idh) {
        serve.DeletarUsuario(idh);
        return "Usuario deletado com sucesso!";
    }




















































}
