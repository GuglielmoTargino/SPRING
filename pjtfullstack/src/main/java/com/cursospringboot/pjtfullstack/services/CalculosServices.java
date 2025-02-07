package com.cursospringboot.pjtfullstack.services;

import org.springframework.stereotype.Service;

import com.cursospringboot.pjtfullstack.entities.Entrada;
import com.cursospringboot.pjtfullstack.entities.Resultados;

@Service
public class CalculosServices {

    

    public Resultados somo(Entrada entrada){
        Resultados resultado = new Resultados();
        
        Integer soma=0;

        if (entrada.getLista() != null) {           

            for (int i=0; i<entrada.getLista().size();i++){
                soma+=entrada.getLista().get(i);
            } 
            
        }


        resultado.setSoma(soma);
        return resultado;
       

    }

}
