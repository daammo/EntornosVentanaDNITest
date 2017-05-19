package Logica;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		CalcularLetra prueba=new CalcularLetra("21702919");
		String letra="G";
		System.out.println(prueba.devolverLetra());
		assertTrue(letra.equals(prueba.devolverLetra()));
	}

}
