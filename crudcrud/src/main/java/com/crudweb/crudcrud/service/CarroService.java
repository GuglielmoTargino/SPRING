package com.crudweb.crudcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudweb.crudcrud.entity.Carro;
import com.crudweb.crudcrud.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carrocel;

    public String save(Carro carro){
        this.carrocel.save(carro);
        return "Carro salvo";
    }

    public String update(Carro carro, Long id){
        carro.setId(id);
        this.carrocel.save(carro);

        return "Carro atualiado";
    }

    public String delete(Long id){
        this.carrocel.deleteById(id);
        return "Carro deletado";
    }

    public List<Carro> findall(){
        List<Carro> lista =this.findall();
        return lista;
    }

    public Carro findById(Long id){
       Carro item = this.findById(id);
        return item;
     
    }

}
