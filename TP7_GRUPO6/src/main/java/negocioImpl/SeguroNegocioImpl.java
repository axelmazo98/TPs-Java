package negocioImpl;

import java.util.List;
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
	
	public List<Seguro> getSeguros(){
		
		List<Seguro> list = segDao.getSeguros();
		
		return list;
	}

	public List<Seguro> getSegurosFiltro(int tipo){
		
		List<Seguro> list = segDao.getSegurosFiltro(tipo);
		
		return list;
	}
}
