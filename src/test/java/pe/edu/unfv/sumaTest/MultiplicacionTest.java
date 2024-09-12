package pe.edu.unfv.sumaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import pe.edu.unfv.operaciones.Multiplicacion;

public class MultiplicacionTest {

	Multiplicacion multiplicacion = new Multiplicacion();
	
	@Test
	public void multiplicacionTest() {
		
		System.out.println("multiplicacionTest");
		
		int multiplicacionTest = multiplicacion.multiplicacion(5);
		int resultadoEsperado = 25;
		
		assertEquals(resultadoEsperado, multiplicacionTest);
	}
}
