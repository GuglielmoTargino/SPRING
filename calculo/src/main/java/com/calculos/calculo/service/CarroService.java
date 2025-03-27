package com.calculos.calculo.service;

import org.springframework.stereotype.Service;
import com.calculos.calculo.entity.Carro;


@Service
public class CarroService {
    public String save(Carro carro){
        // Query aqui
        return "Carro cadastrado";
    }

    public Carro find(int id){
        if (id==1) {
            Carro carro = new Carro();

            carro.setNome("TUKO");
            carro.setMarca("Kroco");
            carro.setModelo("Tekira");
            carro.setAno(2000);

            return carro;
            
        }else{
            return null;

        }

       
    }

}
