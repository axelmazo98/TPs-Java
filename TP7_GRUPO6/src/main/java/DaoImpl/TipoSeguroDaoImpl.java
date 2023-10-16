package DaoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.ITipoSeguroDao;
import dominio.tipoSeguro;

public class TipoSeguroDaoImpl implements ITipoSeguroDao {

	private Conexion cn;
	
	@Override
	public List<tipoSeguro> listarTipos() {
		
		List<tipoSeguro> lista= new ArrayList<tipoSeguro>();
		cn= new Conexion();
		cn.Open();
		
		String query= "select * from tiposeguros ";
		
		try {
			
			ResultSet rs=cn.query(query);
			
			while (rs.next()) {
				
				tipoSeguro tipo= new tipoSeguro();
				tipo.setIdTipo(rs.getInt("tiposeguros.idTipo"));
				tipo.setDescripcion(rs.getString("tiposeguros.descripcion"));
				
				lista.add(tipo);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			cn.close();
		}
		
		return lista;
	}

}
