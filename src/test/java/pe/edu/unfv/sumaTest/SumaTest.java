package pe.edu.unfv.sumaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pe.edu.unfv.operaciones.Suma;

public class SumaTest {

	Suma suma = new Suma();
	
	@AfterEach
	public void after() {
		System.out.println("after");
	}
	
	@Test
	public void sumaTest() {
		System.out.println("sumaTest");
		int sumTest = suma.suma(15, 20);
		int resultadoEsperado = 35;
		
		assertEquals(resultadoEsperado, sumTest);
	}
	
	@BeforeEach
	public void before() {
		System.out.println("before");
	}
	
}
