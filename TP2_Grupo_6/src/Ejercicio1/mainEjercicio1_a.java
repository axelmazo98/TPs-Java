package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {
	
	public static void main(String[] args) {
		ArrayList<Profesor>ListaProfesores = new ArrayList<Profesor>(5);
		
		ListaProfesores.add(new Profesor("Marcelo Sánchez", 58, "Profesor Universitario", 25));
		ListaProfesores.add(new Profesor("Silvia Truco", 55, "Profesora Primaria", 15));
		ListaProfesores.add(new Profesor("Laura Rivas", 47, "Profesora Primaria", 10));
		ListaProfesores.add(new Profesor("Tomás Truch", 39, "Profesor Primaria", 7));
		ListaProfesores.add(new Profesor("Carla Salvio", 50, "Profesora Secundaria", 20));
		
		ListIterator<Profesor> iterador = ListaProfesores.listIterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}

}
