package com.targino.cadastro.servicos;

import org.springframework.stereotype.Service;

@Service
public class MostrarDados {

    public String informarDados(String nome){

        return "Informando os dados!"+nome;

    }

}
