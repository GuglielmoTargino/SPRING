package com.calculos.calculo.repository;


import com.calculos.calculo.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;//Caarrro Repositorio JPA serve com qualquer banco..

public interface CarroRepository extends JpaRepository<Carro,Long>{

}
