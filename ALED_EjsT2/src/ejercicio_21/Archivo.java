//Representa un archivo con un tamaño específico
package ejercicio_21;


public class Archivo {
	private String nombre;
	private double pesoMB; //Tamaño en Megabytes
	
	public Archivo(String nombre, double peso) {
		this.nombre = nombre;
		this.pesoMB = peso;
	}
	
	public double getPesoMB() {
		return this.pesoMB;
	}
}
 