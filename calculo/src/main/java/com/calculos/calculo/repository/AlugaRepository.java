package com.calculos.calculo.repository;


import com.calculos.calculo.entity.Alugado;
//import com.calculos.calculo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;//Caarrro Repositorio JPA serve com qualquer banco..



public interface AlugaRepository extends JpaRepository<Alugado, Long>{

}
