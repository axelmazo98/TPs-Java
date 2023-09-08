package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Archivo archivo= new Archivo();
		archivo.setRuta("Personas.txt");
		
		TreeSet<Persona> personas= archivo.leerPersonas();
		
		Iterator<Persona> iterador= personas.iterator();
		
		System.out.println(personas.size());
		for (Persona persona : personas) {
			System.out.println(persona.toString());
		}
		
		/*archivo.GuardarEnArchivoResultado();	
		
		Archivo ar2 = new Archivo();
		ar2.setRuta("Resultado.txt");
		ar2.leerLineas();*/
		
				
		
	}

}
