package ejercicio_26;

public class Palindromo {
	public static boolean esPalindromo(String texto) {
		texto = texto.replace(" ", "").toLowerCase();
		if(texto.length()<=1) {
			return true;
		}
		if(texto.charAt(0) == texto.charAt(texto.length()-1)) {
			String nuevaCadena = texto.substring(1, texto.length()-1);
			return esPalindromo(nuevaCadena);
		}
		return false;
	}
}
