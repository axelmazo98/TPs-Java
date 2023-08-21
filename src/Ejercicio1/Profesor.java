package Ejercicio1;

public class Profesor extends Empleado{
	
	private String cargo;
	private int antiguedad;

	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	public Profesor(String cargo, int antiguedad) {
		super();
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
	
	
	
	

}
