package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEsDecimal {
	
	@Test
	void testEsDecimalConComa() {
		CadenaUtils cadena = new CadenaUtils("2,5");
		assertTrue(cadena.esDecimal());
		
		
	}
	
	@Test
	void testEsDecimalConPunto() {
		CadenaUtils cadena = new CadenaUtils("2.5");
		assertTrue(cadena.esDecimal());
		
		
	}
	
	@Test
	void testNoEsDecimal() {
		CadenaUtils cadena = new CadenaUtils("25");
		assertFalse(cadena.esDecimal());
		
		
	}
	
	@Test
	void testNoEsNumero() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertFalse(cadena.esDecimal());
		
		
	}
	
	

	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.esDecimal());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.esDecimal());
	}

}
