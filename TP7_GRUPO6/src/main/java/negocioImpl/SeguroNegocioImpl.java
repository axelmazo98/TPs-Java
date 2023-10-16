package negocioImpl;

import DaoImpl.seguroDaoImpl;
import dominio.Seguro;
import negocio.ISeguroNegocio;

public class SeguroNegocioImpl implements ISeguroNegocio {

	private seguroDaoImpl segDao= new seguroDaoImpl(); 
	
	@Override
	public boolean agregarSeguro(Seguro nuevo) {
		//Aca prodian ir validaciones creo
		return segDao.agregarSeguro(nuevo);
	}

	@Override
	public int getProximoId() {
		int id= segDao.getUltimoId()+1;
		return id;
	}

}
