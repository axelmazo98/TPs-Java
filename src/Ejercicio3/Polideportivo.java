package Ejercicio3;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {

	private String nombre;
	private double superficie;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	@Override
	public int getTipoDeInstalacion() {
		return 0;
	}

	@Override
	public double getSuperficieEdificio() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Tipo de Instalación: " + getTipoDeInstalacion()
				+ ", Superficie en m2: " + getSuperficieEdificio();
	}
	
}
