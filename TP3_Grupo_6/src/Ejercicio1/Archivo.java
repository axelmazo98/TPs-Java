package Ejercicio1;

public class Archivo {
	private String ruta;

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
