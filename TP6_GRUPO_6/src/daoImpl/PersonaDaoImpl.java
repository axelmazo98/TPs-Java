package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IPersonaDao;
import Entidades.Persona;

public class PersonaDaoImpl implements IPersonaDao {
	
	private static final String insert = "INSERT INTO personas(Dni, Nombre, Apellido) VALUES(?, ?, ?)";	
	private static final String modify = "UPDATE personas SET Nombre = ?, Apellido = ? WHERE Dni = ?";
	private static final String delete = "DELETE FROM personas WHERE Dni = ?";
	private static final String readall = "SELECT * FROM personas";

	
	@Override
	public boolean insert(Persona persona) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		try
		{
			statement = conexion.prepareStatement(insert);
			statement.setString(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isInsertExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isInsertExitoso;
	}
	@Override
	public boolean modify(Persona persona) {
	    PreparedStatement statement;
	    Connection conexion = Conexion.getConexion().getSQLConexion();
	    boolean isModifyExitoso = false;

	    try {
	        statement = conexion.prepareStatement(modify);
	        statement.setString(1, persona.getNombre());
	        statement.setString(2, persona.getApellido());
	        statement.setString(3, persona.getDni());

	        if (statement.executeUpdate() > 0) {
	            conexion.commit();
	            isModifyExitoso = true;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        try {
	            conexion.rollback();
	        } catch (SQLException e1) {
	            e1.printStackTrace();
	        }
	    }
	    

	    return isModifyExitoso;
	}
	
	@Override
	public boolean delete(Persona persona) {
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isDeleteExitoso = false;
		
		try {
			statement = conexion.prepareStatement(delete);
			statement.setString(1, persona.getDni());
			
			if (statement.executeUpdate() > 0) {
				conexion.commit();
				isDeleteExitoso = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isDeleteExitoso;
	}
	@Override
	public ArrayList<Persona> ReadALL()
	{
		PreparedStatement statement;
		ResultSet resultSet; //Guarda el resultado de la query
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}
	
	private Persona getPersona(ResultSet resultSet) throws SQLException
	{
		String dni = resultSet.getString("Dni");
		String nombre = resultSet.getString("Nombre");
		String apellido = resultSet.getString("Apellido");
		return new Persona(dni, nombre, apellido);
	}

}
