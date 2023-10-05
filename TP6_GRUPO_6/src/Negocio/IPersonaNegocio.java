package Negocio;

import java.util.ArrayList;

import Entidades.Persona;

public interface IPersonaNegocio {
	public String insert(Persona persona);
	public String delete(Persona persona);
	public String modify(Persona persona);
	public ArrayList<Persona> readALL();
	public boolean existeDNI(String dni);

}
