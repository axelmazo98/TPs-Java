package Ejercicio3;


public class EdificioOficinas implements IEdificio {
    private int numeroOficinas;
    private double superficie;
    
    
    public EdificioOficinas() {
    	this.numeroOficinas=0;
    	this.superficie=0;
    }
    
    public EdificioOficinas(int numeroOficinas,double superficie) {
    	this.numeroOficinas= numeroOficinas;
    	this.superficie= superficie;
    }
    
    public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNumeroOficinas() {
        return numeroOficinas;
    }
    

    public void setNumeroOficinas(int numeroOficinas) {
		this.numeroOficinas = numeroOficinas;
	}

	@Override
    public String toString() {
        return "Edificio de Oficinas - Número de Oficinas: " + numeroOficinas;
    }

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
