package Entidades;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	
	private String dni;
	private String nombre;
	private String apellido;
		
	public Persona(){
		
	}
	
	public Persona(String d, String n, String a) {
		this.dni = d;
		this.nombre = n;
		this.apellido = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre + " - " + apellido;
	}
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

	@Override
	 public int compareTo(Persona otraPersona) {
       
        return this.dni.compareTo(otraPersona.dni);
    }
	
	
}
