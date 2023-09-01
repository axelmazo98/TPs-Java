package Ejercicio1;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

	private String Nombre;
	private String Apellido;
	private String DNI;
	
	///constructores
	
	public Persona() {
		
		super();
		Nombre = "";
		Apellido = "";
		DNI = "";
	}
	
	public Persona (String nombre, String apellido, String dNI) {
		
		super();
		Nombre = nombre;
		Apellido = apellido;
		DNI = dNI;
	}
	
	///getters y setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	///metodos
	public static boolean validarDNI (String DNI) throws DNIinvalido {
		Boolean tieneLetra = false;
		
		for(int i=0; i<DNI.length(); i++) {
			if(Character.isLetter((DNI.charAt(i)))){			
				tieneLetra = true;
			}
		}
		
		/*if(tieneLetra) {
			DNIinvalido exc1 = new DNIinvalido();
        	throw exc1;
		}
		*/
		return tieneLetra;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + "]";
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		int comparacionApellido = this.Apellido.compareTo(o.Apellido);
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        return this.Nombre.compareTo(o.Nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(Apellido, Nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Apellido, other.Apellido) && Objects.equals(Nombre, other.Nombre);
	}
	
	
}
