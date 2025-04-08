package com.crudweb.crudcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.crudweb.crudcrud.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
