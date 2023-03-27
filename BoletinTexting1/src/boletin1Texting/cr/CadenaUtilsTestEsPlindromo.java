package boletin1Texting.cr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTestEsPlindromo {
	
	
	@Test
	void testEsPalindromoSinEspaciosEnMinuscula() {
		CadenaUtils cadena = new CadenaUtils("rayar");
		assertTrue(cadena.esPalindromo());
	}
	
	@Test
	void testEsPalindromoConEspaciosEnMinuscula() {
		CadenaUtils cadena = new CadenaUtils("somos o no somos");
		assertTrue(cadena.esCapicua());
	}
	
	@Test
	void testEsPalindromoSinEspaciosEnMayuscula() {
		CadenaUtils cadena = new CadenaUtils("Rayar");
		assertTrue(cadena.esPalindromo());
	}
	
	@Test
	void testEsPalindromoConEspaciosEnMayuscula() {
		CadenaUtils cadena = new CadenaUtils("Somos o no somos");
		assertTrue(cadena.esCapicua());
	}
	
	@Test
	void testNoEsCapicua() {
		CadenaUtils cadena = new CadenaUtils("Hola");
		assertFalse(cadena.esPalindromo());
	}
	
	
	@Test
	void testEsNull() {
		CadenaUtils cadena = new CadenaUtils(null);
		assertFalse(cadena.esPalindromo());
		
		
	}
	
	@Test
	void testEstaVacia() {
		CadenaUtils cadena = new CadenaUtils("");
		assertFalse(cadena.esPalindromo());
	}
}
