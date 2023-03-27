package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEsEntero {

	@Test
	void testEsEntero() {
		CadenaUtils cadena = new CadenaUtils("25");
		assertTrue(cadena.esEntero());
		
		
	}
	
	
	@Test
	void testNoEsEntero() {
		CadenaUtils cadena = new CadenaUtils("2,5");
		assertFalse(cadena.esEntero());
		
		
	}
	
	@Test
	void testNoEsNumero() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertFalse(cadena.esEntero());
		
		
	}
	
	

	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.esEntero());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.esEntero());
	}

}
