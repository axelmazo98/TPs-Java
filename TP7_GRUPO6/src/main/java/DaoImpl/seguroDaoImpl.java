package DaoImpl;

import java.sql.ResultSet;

import Dao.IseguroDao;
import dominio.Seguro;

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

	
}
