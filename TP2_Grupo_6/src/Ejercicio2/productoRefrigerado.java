package Ejercicio2;

public class productoRefrigerado extends Producto {

	//código del organismo de supervisión alimentaria
	private int codOrganismo;
	
	public productoRefrigerado() {
		super();
		codOrganismo = 0;
	}
	
	public productoRefrigerado(String fechaCaducidad, int numeroLote, int codOrganismo) {
        super(fechaCaducidad, numeroLote);
        this.codOrganismo = codOrganismo;
    }

	public int getCodOrganismo() {
		return codOrganismo;
	}

	public void setCodOrganismo(int codOrganismo) {
		this.codOrganismo = codOrganismo;
	}

	@Override
	public String toString() {
		return super.toString() + "Código Organismo: " + codOrganismo;
	}
	
}


