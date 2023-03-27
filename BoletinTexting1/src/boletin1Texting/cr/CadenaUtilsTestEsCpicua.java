package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEsCpicua {

	@Test
	void testEsCapicua() {
		CadenaUtils cadena = new CadenaUtils("33");
		assertTrue(cadena.esCapicua());
	}
	
	@Test
	void testNoEsCapicua() {
		CadenaUtils cadena = new CadenaUtils("123");
		assertFalse(cadena.esCapicua());
	}
	
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.esCapicua());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.esCapicua());
	}

}
