package com.mysql.crudmysql.controller;

@RestController
@RequestMapping("/carros")
public class Controller {

    private final CarroDAO carroDAO;

    public CarroController(CarroDAO carroDAO) {
        this.carroDAO = carroDAO;
    }

    @GetMapping("/listar")
    public void listar() {
        carroDAO.listarCarros();
    }
}





