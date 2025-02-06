package com.crud1.sistema_crud.repository;

import com.crud1.sistema_crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
