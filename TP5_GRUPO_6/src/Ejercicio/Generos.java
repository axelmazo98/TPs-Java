package Ejercicio;

public class Generos {

	private String Nombre;
	//CONSTRUCTO
	public Generos() {
		
	}	

	public Generos(String nombre) {
		super();
		Nombre = nombre;
	}

	//GETS Y SETS
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	//METODOS
	@Override
	public String toString() {
		return "Genero : "+ Nombre;
	}
}
