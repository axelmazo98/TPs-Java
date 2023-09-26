package main;

import presentacion.controlador.controladorPersona;
import presentacion.vista.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal vista = new VentanaPrincipal();
		controladorPersona ctrl = new controladorPersona(vista);
		ctrl.inicializar();
	}

}
