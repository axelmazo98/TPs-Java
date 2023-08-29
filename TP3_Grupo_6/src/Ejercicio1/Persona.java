package Ejercicio1;

public class Persona {

	private String Nombre;
	private String Apellido;
	private int DNI;
	
	///constructores
	
	public Persona() {
		
		super();
		Nombre = "";
		Apellido = "";
		DNI = 0;
	}
	
	public Persona (String nombre, String apellido, int dNI) {
		
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
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
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
		
		if(tieneLetra) {
			DNIinvalido exc1 = new DNIinvalido();
        	throw exc1;
		}
		
		return tieneLetra;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + "]";
	}
	
	
}
