package com.pjt8sembck1.pjt8sembck1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.pjt8sembck1.pjt8sembck1.entity.Usuario;





public interface UserRepository extends JpaRepository<Usuario, Long>{
     Usuario findByNomeusuAndSenha(String nomeusu, String senha);

    
}