package com.calculos.calculo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CalculoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculoApplication.class, args);
	}

}
