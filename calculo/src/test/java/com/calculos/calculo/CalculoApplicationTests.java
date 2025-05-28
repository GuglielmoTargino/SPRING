package com.calculos.calculo;



import com.calculos.calculo.repository.CarroRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import static org.mockito.Mockito.when;



@SpringBootTest
class CalculoApplicationTests {

	List<Integer> lis = new ArrayList<>();

	
	


	@MockitoBean
	CarroRepository car;
	
	@BeforeEach
	void prepair(){
		//List<Integer> lis = new ArrayList<>();
		lis.add(5);
		lis.add(5);
		lis.add(5);
		lis.add(5);
	

		when(car.findAll()).thenReturn(null);
	}

	@Test
	void contextLoads() {	
	
 	
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
		
	
	}



}
