package com.calculos.calculo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.calculos.calculo.entity.Carro;
import com.calculos.calculo.repository.CarroRepository;


@Service
public class CarroService {
    @Autowired
    private CarroRepository carroRepository;

    public String save(Carro carro){

        this.carroRepository.save(carro);
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
