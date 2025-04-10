package com.calculos.calculo.service;


import org.springframework.stereotype.Service;
import com.calculos.calculo.entity.Entrada;
import com.calculos.calculo.entity.Resultado;
import java.util.Collections;
import java.util.List;



@Service
public class CalculosService {

    public Resultado somar(Entrada entrada) {
        Resultado resultado= new Resultado();
        Integer j=0;

        if (entrada.getLista() != null) {

            for (int i=0;i<entrada.getLista().size(); i++){
                j+= entrada.getLista().get(i);
            }
            
        }
       
        resultado.setSoma(j);
        double medi=(double)j/entrada.getLista().size();
        resultado.setMedia(medi);

        Integer maior = Collections.max(entrada.getLista());
        resultado.setMax(maior);
        Integer menor = Collections.min(entrada.getLista());
        resultado.setMin(menor);
        Integer cont= entrada.getLista().size();
        resultado.setCont(cont);

        return resultado;   
        
    }


    public int soma(List<Integer> x){
        int soma = 0;

        for ( int i=0; i<x.size(); i++){
            soma+=x.get(i);
            }

            return soma;

     
    }

}
