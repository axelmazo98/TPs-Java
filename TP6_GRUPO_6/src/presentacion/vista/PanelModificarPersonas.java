package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelModificarPersonas extends JPanel {
	
	private JButton btnModificar;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	/**
	 * Create the panel.
	 */
	public PanelModificarPersonas() {
		setLayout(null);
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModificar.setBounds(315, 233, 125, 34);
		add(btnModificar);
		
		JList Jlist = new JList();
		Jlist.setBounds(28, 177, 387, -151);
		add(Jlist);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 240, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(106, 240, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(202, 240, 86, 20);
		add(txtDNI);
		txtDNI.setColumns(10);

	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}
}