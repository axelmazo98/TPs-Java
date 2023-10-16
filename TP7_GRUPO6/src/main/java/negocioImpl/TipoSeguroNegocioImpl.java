package negocioImpl;


import java.util.List;

import DaoImpl.TipoSeguroDaoImpl;
import negocio.ITipoSeguroNegocio;

import dominio.tipoSeguro;

public class TipoSeguroNegocioImpl implements ITipoSeguroNegocio {

	private TipoSeguroDaoImpl tipoDao= new TipoSeguroDaoImpl();
	
	@Override
	public List<tipoSeguro> listarTipos() {
		//Aca nose que iriia, calculo que validaciones
		List<tipoSeguro> lista=tipoDao.listarTipos();
		return lista;
	}

}
