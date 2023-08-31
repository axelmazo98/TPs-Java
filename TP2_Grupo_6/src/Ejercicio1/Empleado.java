package Ejercicio1;

public class Empleado {
	
	private final int Id;
	private String Nombre;
	private int Edad;
	
	private static int Cont=1000;
	 
	//CONSTRUCTORES
	
	public Empleado()
	{
		this.Id=Cont;
		this.Nombre="Sin Nombre";
		this.Edad=99;
		Cont++;
	}
	
	public Empleado(String Nombre, int Edad)
	{
		this.Id = Cont;
		this.Nombre = Nombre;
		this.Edad = Edad;
		Cont++;
	}
	
	//Metodo
	public static int devuelveProximoId()
	{
		return Cont;
	}
	
	/// Setters y Getters
	
	public int getId() {
		return Id;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	//METODOS
	
	@Override
	public String toString() {
		return "Empleado ID=" + Id + ", NOMBRE=" + Nombre + ", EDAD=" + Edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Edad;
		result = prime * result + Id;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (Edad != other.Edad)
			return false;
		if (Id != other.Id)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
	}
}

