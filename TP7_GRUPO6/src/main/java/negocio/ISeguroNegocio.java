package negocio;

import dominio.Seguro;

public interface ISeguroNegocio {

	public boolean agregarSeguro(Seguro nuevo);
	public int getProximoId();
	
	
}
