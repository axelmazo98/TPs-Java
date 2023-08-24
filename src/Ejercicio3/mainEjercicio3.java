package Ejercicio3;

import java.util.ArrayList;

public class mainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<IEdificio> lista = new ArrayList<IEdificio>(5);
		
		lista.add(new Polideportivo("poli1",1));
		lista.add(new Polideportivo("poli2",2));
		lista.add(new Polideportivo("poli3",3));
		
		lista.add(new EdificioOficinas(100,1));
		lista.add(new EdificioOficinas(200,2));
		
		
	}

}
