package Ejercicio2;


public class Producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	public Producto(){
		fechaCaducidad = "00/00/0000";
		numeroLote = 0;	
	}
	
	public Producto(String fecha, int numLote){
		this.fechaCaducidad = fecha;
		this.numeroLote = numLote;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return "Fecha Caducidad: " + fechaCaducidad + ", Número de lote: " + numeroLote +", ";
	}
	
	
}
