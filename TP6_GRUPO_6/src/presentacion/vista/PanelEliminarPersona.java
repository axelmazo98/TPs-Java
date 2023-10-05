package presentacion.vista;

import Entidades.Persona;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelEliminarPersona extends JPanel {
	
	private JLabel lblEliminarUsuario;
	private JList listEliminar;
	private JButton btnEliminar;
	/**
	 * Create the panel.
	 */
	public PanelEliminarPersona() {
		setLayout(null);
		
		lblEliminarUsuario = new JLabel("Eliminar Usuarios");
		lblEliminarUsuario.setBounds(151, 11, 121, 14);
		add(lblEliminarUsuario);
		
		listEliminar = new JList();
		listEliminar.setBounds(33, 36, 380, 163);
		add(listEliminar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(155, 210, 89, 23);
		add(btnEliminar);

	}
	
	public JLabel getLblEliminarUsuario() {
		return lblEliminarUsuario;
	}

	public JList getListEliminar() {
		return listEliminar;
	}
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
}
