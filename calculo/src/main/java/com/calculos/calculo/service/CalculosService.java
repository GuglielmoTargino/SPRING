package com.calculos.calculo.service;


import org.springframework.stereotype.Service;
import com.calculos.calculo.entity.Entrada;
import com.calculos.calculo.entity.Resultado;


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
        return resultado;
    
        
    }

}
