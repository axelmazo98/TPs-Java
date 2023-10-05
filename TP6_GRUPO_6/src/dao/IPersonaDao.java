package dao;

import java.util.ArrayList;

import Entidades.Persona;

public interface IPersonaDao {

	public boolean insert(Persona persona);
	public ArrayList<Persona>ReadALL();
	public boolean modify(Persona persona);
	public boolean delete (Persona persona);
}
