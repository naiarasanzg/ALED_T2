package ejercicio_21;
import java.util.List;

// Representa una carpeta que puede contener archivos y otras subcarpetas
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; //Archivos directos en esta carpeta
	private List<Carpeta> subcarpetas; //Carpetas dentro de esta carpeta
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
	}
	public List<Archivo> getArchivos(){
		return this.archivos;
	}
	public List<Carpeta> getSubcarpetas(){
		return this.subcarpetas;
	}
	public static double calcularPesoTotal(Carpeta inicio) {
		if(inicio == null) {
			return 0;
		}
		double sumaPeso = 0;
		
		if(inicio.getSubcarpetas().isEmpty()) {
			for(Archivo a: inicio.getArchivos()) {
				sumaPeso += a.getPesoMB();
			}
		}else {			
			for(Carpeta c: inicio.getSubcarpetas()) {
				sumaPeso += calcularPesoTotal(c);
			}
		}
		return sumaPeso;
	}
}
