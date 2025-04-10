package com.calculos.calculo;

import com.calculos.calculo.entity.Entrada;
import com.calculos.calculo.entity.Resultado;
import com.calculos.calculo.service.CalculosService;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculoApplicationTests {


	@Autowired
    CalculosService calculoteste;
	//@Autowired
	//Entrada pega;
	//@Autowired
	//Entrada mostra;


		int y=20;

	@Test
	void contextLoads() {
	
		/*List<Integer> lis = new ArrayList<>();
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
		pega.setLista(lis);
		 mostra.getLista();	
	   Resultado retorno = this.calculoteste.somar(mostra);
        assertEquals(40, retorno);		
		*/
	}


	@Test
	void cenario2(){
		List<Integer> lis = new ArrayList<>();
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
	
	

		int retorno = calculoteste.soma(lis);
		assertEquals(30, retorno);
	}




}
