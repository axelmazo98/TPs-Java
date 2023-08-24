package Ejercicio2;

public class productoCongelado extends Producto{

	private int tempCongelacionRecomendada;

	//Constructores
	public productoCongelado() {
		super();
		this.tempCongelacionRecomendada=0;
	}
	
	public productoCongelado(String fechaCaducidad,int numLote, int tempCongelacionRecomendada) {
		super(fechaCaducidad,numLote);
		this.tempCongelacionRecomendada= tempCongelacionRecomendada;
	}
	
	//Gets y Sets
	public int getTempCongelacionRecomendada() {
		return tempCongelacionRecomendada;
	}

	public void setTempCongelacionRecomendada(int tempCongelacionRecomendada) {
		this.tempCongelacionRecomendada = tempCongelacionRecomendada;
	}
	
	
	

}

