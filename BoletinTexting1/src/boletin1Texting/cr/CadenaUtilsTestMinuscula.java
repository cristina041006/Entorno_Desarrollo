package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestMinuscula {

	@Test
	void testEsMinuscula() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertEquals("hola", cadena.toMiniscula());
		
	}
	
	@Test
	void testNoEsMinuscula() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertNotEquals("HOLA", cadena.toMiniscula());
		
	}
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertEquals("Sin datos", cadena.toMiniscula());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertEquals("Sin datos", cadena.toMiniscula());
		
		
	}

}
