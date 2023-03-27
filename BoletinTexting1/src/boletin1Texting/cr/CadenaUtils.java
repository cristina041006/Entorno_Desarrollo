package boletin1Texting.cr;

public class CadenaUtils {
	
	private String cadena;
	
	public CadenaUtils() {
		super();
	}
	
	public CadenaUtils(String cadena) {
		this();
		this.cadena=cadena;
	}
	
	public String toMayuscula () {
		StringBuilder cadenaMayuscula= new StringBuilder();
		if (cadena!=null && !cadena.isEmpty()) {
			for (int i=0; i<cadena.length(); i++) {
				cadenaMayuscula.append(Character.toUpperCase(cadena.charAt(i)));
			}
		}else {
			cadenaMayuscula.append("Sin datos");
		}
		
		return cadenaMayuscula.toString();
	}
	
	public String toMiniscula() {
		StringBuilder cadenaMinuscula= new StringBuilder();
		if (cadena!=null && !cadena.isEmpty()) {
			for (int i=0; i<cadena.length(); i++) {
				cadenaMinuscula.append(Character.toLowerCase(cadena.charAt(i)));
			}
		}else {
			cadenaMinuscula.append("Sin datos");
		}
		
		return cadenaMinuscula.toString();
	}
	
	public boolean estaEnMayuscula () {
		boolean mayuscula= false;
		int contador=0;
		
		if (cadena!=null && !cadena.isEmpty()) {
			while (!mayuscula && contador<cadena.length()) {
				if (Character.isUpperCase(cadena.charAt(contador))) {
					mayuscula=true;
				}
				contador++;
			}
			
		}
		
		return mayuscula;
	}
	
	public boolean estaEnMinuscula () {
		boolean minuscula= false;
		int contador=0;
		
		if (cadena!=null && !cadena.isEmpty()) {
			while (!minuscula && contador<cadena.length()) {
				if (Character.isLowerCase(cadena.charAt(contador))){
					minuscula=true;
				}
				contador++;
			}
			
		}
		
		return minuscula;
	}
	
	public boolean esDecimal () {
		boolean decimal= false;
		boolean punto = false;
		int contador=0;
		
		if (cadena!=null && !cadena.isEmpty()) {
			while (!decimal && !punto && contador<cadena.length()) {
				if (Character.isDigit(cadena.charAt(contador))){
					if (cadena.charAt(contador)==',' || cadena.charAt(contador)=='.'){
						punto=true;
						if (punto==true) {
							decimal=true;
						}
						
					}
					
				}
				contador++;
			}
			
		}
		
		return decimal;
	}
	
	public boolean esEntero () {
		boolean entero= false;
		int contador=0;
		
		if (cadena!=null && !cadena.isEmpty()) {
			while (!entero && contador<cadena.length()) {
				if (Character.isDigit(cadena.charAt(contador))){
					if (cadena.charAt(contador)!=',' || cadena.charAt(contador)!='.') {
						entero=true;
					}
					
				}
				contador++;
			}
			
		}
		
		return entero;
	}
	
	public  boolean esCapicua() {
		boolean capicua=false;
		
		String aux="";
		
		if (cadena!=null && !cadena.isEmpty()) {
			for (int i=0 ; i<cadena.length()/2; i++) {
				if (cadena.charAt(i)==cadena.charAt(cadena.length()-1-i)) {
					capicua=true;
				}
				
			}
			
			
			
		}
		return capicua;
	}
	
	public boolean esPalindromo () {
		boolean mensaje=false;
		
		String nuevaCadena="";
		String aux="";
		
		if (cadena!=null && !cadena.isEmpty()) {
			for (int i=0; i<cadena.length(); i++) {
				if (cadena.charAt(i)!=' ') {
					nuevaCadena+=cadena.charAt(i);
				}
			}
			
			for (int a=0 ; a<nuevaCadena.length(); a++) {
				if (nuevaCadena.charAt(a)==nuevaCadena.charAt(nuevaCadena.length()-1-a)) {
					aux+=nuevaCadena.charAt(a);
				}
				
			}
			
			if (aux.equals(cadena)) {
				mensaje=true;
			}
			
		}
		
		
		return mensaje;
		
		
	}

}
