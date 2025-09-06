package com.calculos.calculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calculos.calculo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

     Usuario findByNomeusuAndSenha(String nomeusu, String senha);

}
