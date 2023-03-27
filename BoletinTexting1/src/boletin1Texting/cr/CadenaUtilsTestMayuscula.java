package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestMayuscula {

	@Test
	void testEsMayuscula() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertEquals("HOLA", cadena.toMayuscula());
		assertNotEquals("hola", cadena.toMayuscula());
		
	}
	
	@Test
	void testNoEsMayuscula() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertNotEquals("hola", cadena.toMayuscula());
		
	}
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertEquals("Sin datos", cadena.toMayuscula());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertEquals("Sin datos", cadena.toMayuscula());
		
		
	}


}
