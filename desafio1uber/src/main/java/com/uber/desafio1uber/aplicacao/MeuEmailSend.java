package com.uber.desafio1uber.aplicacao;

import org.springframework.beans.factory.annotation.Autowired;

import com.uber.desafio1uber.enviaemail.EnviaEmail;

public class MeuEmailSend implements EnviaEmail {

    private final EmailGateway gateway;

    @Autowired
    public MeuEmailSend(EmailGateway gateway){
        this.gateway=gateway;
    }

    @Override
    public void sendEmail(String to, String subjet, String body){
        
    }


}
