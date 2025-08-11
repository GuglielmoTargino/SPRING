package com.oracle.crudoracle.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oracle.crudoracle.service.Servico;
import com.oracle.crudoracle.entity.Usuario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

    //Sallvar
    @PostMapping("salvar")
    public String salvar(@RequestBody Usuario usuario) {
        serve.SalvarUsuarios(usuario);
        return "Usuario salvo com sucesso!";
    }

    // DELETE - excluir pela senha
    @DeleteMapping("/deletar/{senh}")
    public String deletar(@PathVariable Long senh) {
        serve.DeletarUsuario(senh);
        return "Usuario deletado com sucesso!";
    }

    // PUT - atualizar pela senha.
    @PutMapping("/atualizar/{sen}")
    public String atualizar(@PathVariable Long sen, @RequestBody Usuario usa) {
        serve.AtualizarUsuario(sen, usa);
        return "Carro atualizado com sucesso!";
    }






























}

