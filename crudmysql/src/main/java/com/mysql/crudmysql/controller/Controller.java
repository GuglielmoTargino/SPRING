package com.mysql.crudmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mysql.crudmysql.entity.Carro;
import com.mysql.crudmysql.service.Servico;

@RestController
@RequestMapping("/carros")

public class Controller {

    @Autowired
    private Servico serve;

    public CarroController(Carro carroDAO) {
        this.carroDAO = carroDAO;
    }

    @GetMapping("/listar")
    public void listar() {
        carroDAO.listarCarros();
    }
}





