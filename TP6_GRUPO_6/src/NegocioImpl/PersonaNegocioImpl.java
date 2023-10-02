package NegocioImpl;

import dao.IPersonaDao;
import daoImpl.PersonaDaoImpl;

import java.util.ArrayList;
import java.util.ListIterator;

import Entidades.Persona;
import Negocio.IPersonaNegocio;

public class PersonaNegocioImpl implements IPersonaNegocio {
	IPersonaDao dao = new PersonaDaoImpl();
	
	@Override
	public String insert(Persona persona) {
		String mensaje;
		boolean estado=false;
		if(persona.getDni().trim().length()>0 && persona.getNombre().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			if(existeDNI(persona.getDni())) {
				return mensaje = "Esta persona ya existe!";
			}
			else {				
				estado=dao.insert(persona);
			}
		}
		else {
			return mensaje = "Complete todos los campos!";
		}
			
		if(!estado) {
			return mensaje = "No se pudo agregar a la persona";
		}
		else {
			return mensaje = "Persona agregada correctamente!";
		}
	}
	@Override
	public boolean existeDNI(String dni) {
		ArrayList<Persona> pList= new ArrayList<Persona>();
		pList=dao.ReadALL();
		ListIterator<Persona> it = pList.listIterator();
		while (it.hasNext()) {
			Persona p = it.next();
			if (p.getDni().equals(dni)) return true;
		}

		return false;
	}
	public ArrayList<Persona> readALL(){
		ArrayList<Persona> pList= new ArrayList<Persona>();
		pList=dao.ReadALL();
		return pList;
	}

}
