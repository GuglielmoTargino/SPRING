/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testesgugas.pjto2mvn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guglielmo H T
 */
@RestController
@RequestMapping("/ppi")
public class Hello2 {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello GUGA!";
    }
    
}
