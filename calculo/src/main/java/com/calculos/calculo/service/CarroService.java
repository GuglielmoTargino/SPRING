package com.calculos.calculo.service;

import java.util.List;
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

 
    
   public List<Carro> findall(){
        List<Carro> lista =this.carrorepositorio.findAll();
        return lista;
    }
      
    
    public Carro find(long id){
        Carro gh= this.carrorepositorio.findById(id).get();
        return gh;
    }

    
      public String update(Carro carro, Long id){
        carro.setId(id);
        this.carrorepositorio.save(carro);
        return "Carro atualizado";
    }
    
    
    public String delete(Long id){
        this.carrorepositorio.deleteById(id);
        return "Carro deletado";
    }

}

/*
public class CarroService {

    @Autowired
    private CarroRepository carrorepositorio;

    public String save(Carro carro){
        //this.verificarnomecarro(carro.getNome(),carro.getAno());

        this.carrorepositorio.save(carro);
        // Query aqui
        return "Carro cadastrado";
    }

 
 
   public List<Carro> findall(){
        List<Carro> lista =this.carrorepositorio.findAll();
        return lista;
    }
      

    public Carro find(long id){
        Carro gh= this.carrorepositorio.findById(id).get();
        return gh;
    }
} 
 */
