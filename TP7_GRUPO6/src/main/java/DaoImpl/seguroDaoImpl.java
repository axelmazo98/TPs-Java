package DaoImpl;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Dao.IseguroDao;
import dominio.Seguro;
import dominio.tipoSeguro;

public class seguroDaoImpl implements IseguroDao {

	private Conexion cn;
	
	@Override
	public boolean agregarSeguro(Seguro nuevo) {
		
		boolean estado=true;
		cn= new Conexion();
		try 
		{
			cn.Open();
			String query= "insert into segurosgroup.seguros (descripcion,idTipo,costoContratacion,costoAsegurado)values('"+ nuevo.getDescripcion() +"','"+nuevo.getTipo().getIdTipo()+"','"+nuevo.getCostoContratacion()+"','"+nuevo.getCostoMaximo()+"')";
			
			estado= cn.execute(query);
			
		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
		finally 
		{
			cn.close();
		}

		return estado;
	}
	@Override
	public int getUltimoId() {
		
		int id=0;
		cn= new Conexion();
		try 
		{
			cn.Open();
			String query= "select max(idSeguro) from segurosgroup.seguros";
			
			ResultSet rs= cn.query(query);
			
			while(rs.next()) {
				
				id= rs.getInt(1);
				
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();	
		}
		finally 
		{
			cn.close();
		}

		return id;
	}
	
	public List<Seguro> getSeguros() {
			
		List<Seguro> lista= new ArrayList<Seguro>();
			cn= new Conexion();
			cn.Open();
			
			String query= "SELECT *, t.descripcion as tipoDescripcion FROM segurosgroup.seguros as s"
					+ " JOIN segurosgroup.tiposeguros as t "
					+ "on t.idTipo = s.idTipo;";
			
			try {
				
				ResultSet rs=cn.query(query);
				
				while (rs.next()) {
					
					Seguro seguro = new Seguro();
					tipoSeguro tipoSeguro = new tipoSeguro();
					
					seguro.setID(rs.getInt("idSeguro"));
					seguro.setDescripcion(rs.getString("descripcion"));
					tipoSeguro.setIdTipo(rs.getInt("idTipo"));
					tipoSeguro.setDescripcion(rs.getString("tipoDescripcion"));
					seguro.setTipo(tipoSeguro);
					seguro.setCostoContratacion(rs.getDouble("costoContratacion"));
					seguro.setCostoMaximo(rs.getFloat("costoAsegurado"));
					
					lista.add(seguro);
					
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
