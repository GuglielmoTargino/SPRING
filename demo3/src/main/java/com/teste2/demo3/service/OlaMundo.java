package com.teste2.demo3.service;

import org.springframework.stereotype.Service;

@Service
public class OlaMundo {
    public String olamundo(String nome){
        return "Primeiro Spring Boot!"+nome;
    }

}
