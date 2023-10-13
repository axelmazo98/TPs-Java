package dominio;

public class Seguro {
	private int ID;
	private String Descripcion;
	private tipoSeguro Tipo;
	private float costoContratacion;
	private float costoMaximo;
	
	public Seguro() {
		
	}
	
	public Seguro(String Descripcion, tipoSeguro tipo, float costoContratacion, float costoMaximo) {
		this.Descripcion = Descripcion;
		this.Tipo = tipo;
		this.costoContratacion = costoContratacion;
		this.costoMaximo = costoMaximo;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}
	
	public tipoSeguro getTipo() {
		return Tipo;
	}

	public void setTipo(tipoSeguro tipo) {
		this.Tipo = tipo;
	}

	public float getCostoContratacion() {
		return costoContratacion;
	}

	public void setCostoContratacion(float costoContratacion) {
		this.costoContratacion = costoContratacion;
	}

	public float getCostoMaximo() {
		return costoMaximo;
	}

	public void setCostoMaximo(float costoMaximo) {
		this.costoMaximo = costoMaximo;
	}
	
	
	
}
