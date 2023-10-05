package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelEliminarPersona extends JPanel {
	
	private JButton btnEliminar;
	/**
	 * Create the panel.
	 */
	public PanelEliminarPersona() {
		setLayout(null);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(144, 176, 147, 36);
		add(btnEliminar);

	}
	
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
}
