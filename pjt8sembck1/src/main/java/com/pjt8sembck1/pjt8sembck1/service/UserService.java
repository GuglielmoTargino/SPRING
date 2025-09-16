package com.pjt8sembck1.pjt8sembck1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pjt8sembck1.pjt8sembck1.entity.Usuario;
import com.pjt8sembck1.pjt8sembck1.repository.UserRepository;



@Service
public class UserService {

    @Autowired
    private UserRepository usurepo;

    public Usuario autenticar(String nomeusu, String senha){
      return usurepo.findByNomeusuAndSenha(nomeusu,senha);
    }    

}
