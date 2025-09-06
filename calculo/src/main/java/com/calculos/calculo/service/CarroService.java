package com.calculos.calculo.service;

import java.util.List;

import com.calculos.calculo.repository.AlugaRepository;
import com.calculos.calculo.repository.CarroRepository;
import com.calculos.calculo.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculos.calculo.entity.Alugado;
import com.calculos.calculo.entity.Carro;
import com.calculos.calculo.entity.Usuario;




@Service
public class CarroService {

    @Autowired
    private CarroRepository carrorepositorio;
    @Autowired
    private AlugaRepository carroalugado;
    @Autowired
    private UsuarioRepository usurepo;


public Carro convC(Carro alu){
    Carro luga = new Carro();
    luga.setNome(alu.getNome());
    luga.setAno(alu.getAno());
    luga.setMarca(alu.getMarca());
    luga.setModelo(alu.getModelo());
    // copie os demais atributos necessários
    return luga;
}

    public String save(Carro carro){

        //Carro crro = convC(carro);

        this.carrorepositorio.save(carro);
        //this.carrorepositorio.save(carro);
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

     public String alugar(Long id){
        this.carroalugado.deleteById(id);
        return "Carro alugado";
    }


    public String alugar(Carro alu, Long id){        
        this.carrorepositorio.deleteById(id);
        Alugado alug=convCar(alu);
        this.carroalugado.save(alug);    
        return "Carro devolvido";
    }

    public Alugado convCar(Carro alu){
    Alugado luga = new Alugado();
    luga.setNome(alu.getNome());
    luga.setAno(alu.getAno());
    luga.setMarca(alu.getMarca());
    luga.setModelo(alu.getModelo());
    // copie os demais atributos necessários
    return luga;
}
    
/////////Carro alugado aqui 
/// 
/// 

    public String savealug(Alugado carro){
        this.carroalugado.save(carro);
        // Query aqui
        return "Carro cadastrado";
    }
    
    public List<Alugado> findallalug(){
        List<Alugado> lista =this.carroalugado.findAll();
        return lista;
    }     
    
    public Alugado findalug(Long id){
        Alugado gh= this.carroalugado.findById(id).get();
        return gh;
    }    
      public String updatealug(Alugado carro, Long id){
        carro.setId(id);
        this.carroalugado.save(carro);
        return "Carro atualizado";
    } 

    public String deletealug(Alugado alu, Long id){        
        this.carroalugado.deleteById(id);
        Carro alug=convAlug(alu);
        this.carrorepositorio.save(alug);    
        return "Carro devolvido";
    }

public Carro convAlug(Alugado alu){
    Carro carro = new Carro();
    carro.setNome(alu.getNome());
    carro.setAno(alu.getAno());
    carro.setMarca(alu.getMarca());
    carro.setModelo(alu.getModelo());
    // copie os demais atributos necessários
    return carro;
}


public Usuario autenticar(String nomeusu, String senha){
      return usurepo.findByNomeusuAndSenha(nomeusu,senha);
    }    

/*/

public String deletealug(Alugado alu, Long id){
        
        this.carroalugado.deleteById(id);
    
        return "Carro devolvido";
    }*/


































































































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
