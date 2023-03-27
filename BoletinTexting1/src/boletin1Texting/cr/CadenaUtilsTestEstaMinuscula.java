package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEstaMinuscula {

	@Test
	void testEstaMinuscula() {
		CadenaUtils cadena = new CadenaUtils("hola");
		assertTrue(cadena.estaEnMinuscula());
	}
	
	@Test
	void testNOEstaMinuscula() {
		CadenaUtils cadena = new CadenaUtils("HOLA");
		assertFalse(cadena.estaEnMinuscula());
	}
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.estaEnMinuscula());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.estaEnMinuscula());
	}

}
