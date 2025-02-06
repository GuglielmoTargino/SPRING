package com.crud1.sistema_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud1.sistema_crud.entities.User;
import com.crud1.sistema_crud.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/user")
public class UserController {


    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){

        List<User> result=repository.findAll();
        return result;

    }

    @GetMapping(value="/{id}")
    public User findById(@PathVariable Long id){

        User result=repository.findById(id).get();
        return result;

    }

    @PostMapping
    public User findById(@RequestBody User user){

        User result=repository.save(user);
        return result;

    }


}
