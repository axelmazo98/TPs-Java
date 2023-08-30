package Ejercicio1;

import java.io.File;

public class Archivo {
	private String ruta;

	public boolean existe() {
		
		File archivo = new File(ruta);
		
		if (archivo.exists()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	///constructores
	public Archivo() {
		this.ruta = "";
	}
	
	public Archivo(String ruta) {
		this.ruta = ruta;
	}
	
	//getters y setters
	public String getRuta() {
		return ruta;
	}
	
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}
