package Ejercicio2;

import java.util.Date;

public class Producto {
	private Date fechaCaducidad;
	private int numeroLote;
	
	private Producto(){
		
	}
	
	private Producto(Date fecha, int numLote){
		this.fechaCaducidad = fecha;
		this.numeroLote = numLote;
	}
	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
}
