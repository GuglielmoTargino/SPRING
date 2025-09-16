package com.pjt8sembck2.pjt8sembck2.repository;


import com.pjt8sembck2.pjt8sembck2.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;//Caarrro Repositorio JPA serve com qualquer banco..


public interface CarroRepository extends JpaRepository<Carro, Long>{

}
