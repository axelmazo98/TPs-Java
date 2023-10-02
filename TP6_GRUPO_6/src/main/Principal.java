package main;

import Negocio.IPersonaNegocio;
import NegocioImpl.PersonaNegocioImpl;
import presentacion.controlador.controladorPersona;
import presentacion.vista.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal vista = new VentanaPrincipal();
		IPersonaNegocio neg = new PersonaNegocioImpl();
		controladorPersona ctrl = new controladorPersona(vista,neg);
		ctrl.inicializar();
	}

}
