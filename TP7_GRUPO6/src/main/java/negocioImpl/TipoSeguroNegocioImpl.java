package negocioImpl;


import java.util.List;
import java.util.ArrayList;

import DaoImpl.TipoSeguroDaoImpl;
import negocio.ITipoSeguroNegocio;

import dominio.tipoSeguro;

public class TipoSeguroNegocioImpl implements ITipoSeguroNegocio {

	private TipoSeguroDaoImpl tipoDao= new TipoSeguroDaoImpl();
	
	@Override
	public ArrayList<tipoSeguro> listarTipos() {
		//Aca nose que iriia, calculo que validaciones
		ArrayList<tipoSeguro> lista=tipoDao.listarTipos();
		return lista;
	}

}
