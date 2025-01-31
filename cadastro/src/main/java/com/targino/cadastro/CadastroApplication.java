package com.targino.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("oper")
public class CadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
	}

}
