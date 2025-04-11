package com.calculos.calculo;

import com.calculos.calculo.controller.CalculosController;
import com.calculos.calculo.entity.Entrada;
import com.calculos.calculo.entity.Resultado;
import com.calculos.calculo.repository.CarroRepository;
import com.calculos.calculo.service.CalculosService;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import static org.mockito.Mockito.when;



@SpringBootTest
class CalculoApplicationTests {

	List<Integer> lis = new ArrayList<>();

	@Autowired
    CalculosService calculoteste;
	@Autowired
	CalculosController calc;
	Entrada pega = new Entrada();

	@MockitoBean
	CarroRepository car;
	
	@BeforeEach
	void prepair(){
		//List<Integer> lis = new ArrayList<>();
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
		pega.setLista(lis);

		when(car.findAll()).thenReturn(null);
	}

	@Test
	void contextLoads() {	
	  	ResponseEntity<Resultado> retorno = this.calc.somar(pega);
        assertEquals(HttpStatus.OK, retorno.getStatusCode());		
	}

	@Test
	void cenario2(){
		//List<Integer> lis2 = new ArrayList<>();
		//lis2.add(5);
		//lis2.add(5);
		//lis2.add(5);
		//lis2.add(5);
		//lis2.add(5);
		//lis2.add(5);
		int retorno = calculoteste.soma(lis);
		assertEquals(20, retorno);
	}



}
