package Ejercicio1;

public class Profesor extends Empleado implements Comparable <Profesor> {
	
	private String cargo;
	private int antiguedad;

	public Profesor() {
		super();
	}

	public Profesor(String Nombre, int edad, String cargo, int antiguedad) {
		super(Nombre, edad);
		this.cargo = cargo;
		this.antiguedad = antiguedad;
	}

	
	//Gets y Sets
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return super.toString() + " cargo=" + cargo + ", antiguedad=" + antiguedad + "]";
	}

	@Override
	public int compareTo(Profesor arg0) {
		
		//ORDENAMIENTO por Años de antiguedad de Menor a Mayor
		if(arg0.antiguedad == this.antiguedad)
			return 0;
		
		if (arg0.antiguedad<this.antiguedad)
		{
			return 1;
		}		
		return -1;
		
	}

	
	
	
	

}
