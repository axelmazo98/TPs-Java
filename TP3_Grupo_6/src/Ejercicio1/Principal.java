package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archivo archivo= new Archivo();
		archivo.setRuta("Personas.txt");
		
		
		TreeSet<Persona> listaPersonas= archivo.leerPersonas();
		
		System.out.println(listaPersonas.size());
		if(listaPersonas!=null) {
			Iterator<Persona> iterator= listaPersonas.iterator();
			
			while(iterator.hasNext()) {
				Persona persona= iterator.next();
				System.out.println(persona.toString());
			}

		}
		
				
		
	}

}
