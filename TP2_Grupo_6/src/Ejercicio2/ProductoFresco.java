package Ejercicio2;


public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

	///constructores
	public ProductoFresco() {
		super();
		fechaEnvasado = "00/00/00";
		paisOrigen = "Sin Pais";
	}
    public ProductoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    ///gets y sets 
    public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
    public String toString() {
        return super.toString() + ", Fecha de Envasado: " + fechaEnvasado + ", País de Origen: " + paisOrigen;
    }
	
}