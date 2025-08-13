/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.netbeansteste1api.mavenproject1netbeans.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Guglielmo H T
 */

@RestController
public class Hello {
    
    @GetMapping("/hello")
    public String heloo(){
        return "HELLO FUTURE!";
    }
    
}
