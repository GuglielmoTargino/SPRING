package com.calculos.calculo.service;
import com.calculos.calculo.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.calculos.calculo.entity.Carro;



@Service
public class CarroService {

    @Autowired
    private CarroRepository carrorepositorio;

    public String save(Carro carro){

        this.carrorepositorio.save(carro);
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
