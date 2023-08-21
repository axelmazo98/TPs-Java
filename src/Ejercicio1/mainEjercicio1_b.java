package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
        TreeSet<Profesor> profesores = new TreeSet<>();
        
        profesores.add(new Profesor("Axel", 35, "Titular", 10));
        profesores.add(new Profesor("Joaquin", 40, "Suplente", 5));
        profesores.add(new Profesor("Carlos", 28, "Ayudante", 2));
        profesores.add(new Profesor("Matias", 50, "Titular", 20));
        profesores.add(new Profesor("Nahuel", 45, "Ayudante", 15));

        Iterator<Profesor> iterator = profesores.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        Profesor p1 = new Profesor("Juan",45,"Ayudante",2);
        Profesor p2 = new Profesor("Juan",45,"Ayudante",2);
        
        if(p1.equals(p2)) {
        	System.out.println("Son la misma Persona");
        }
        else {
        	System.out.println("Son diferentes Personas");
        }
	}
	
	

}
