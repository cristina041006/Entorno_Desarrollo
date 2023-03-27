package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEsMayuscula {

	@Test
	void testEstaMayuscula() {
		CadenaUtils cadena = new CadenaUtils("HOLA");
		assertTrue(cadena.estaEnMayuscula());
	}
	
	@Test
	void testNOEstaMayuscula() {
		CadenaUtils cadena = new CadenaUtils("hola");
		assertFalse(cadena.estaEnMayuscula());
	}
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.estaEnMayuscula());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.estaEnMayuscula());
	}
		
		
		
}
