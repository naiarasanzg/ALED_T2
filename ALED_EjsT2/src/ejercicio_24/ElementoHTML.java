package ejercicio_24;

import java.util.List;

public class ElementoHTML {
	private String tag; //Ejemplo: "div", "p", "img"
	private List<ElementoHTML> hijos;
	
	public String getTag() {
		return this.tag;
	}
	public List<ElementoHTML> getHijos(){
		return this.hijos;
	}
	public static int contarEtiquetas(ElementoHTML elemento, String tagBuscado) {
		if(elemento == null || tagBuscado == null) return 0;
		int numEtiquetas = 0;
		if(elemento.getHijos().isEmpty()) {
			if(elemento.getTag().equals(tagBuscado)) {
				numEtiquetas = 1;
			}
		}else {
			for(ElementoHTML e: elemento.getHijos()) {
				numEtiquetas += contarEtiquetas(e, tagBuscado);
			}
		}
		return numEtiquetas;
	}
}
