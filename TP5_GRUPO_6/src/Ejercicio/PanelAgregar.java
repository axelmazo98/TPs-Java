package Ejercicio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel {
	private JTextField txtNombre;
	private JLabel lblId;

	/**
	 * Create the panel.
	 */
	public PanelAgregar() {
		setLayout(null);
		
		JLabel lbl_ID = new JLabel("ID");
		lbl_ID.setBounds(43, 31, 46, 14);
		add(lbl_ID);
		
		JLabel lblId = new JLabel("ID ejemplo: 1");
		lblId.setBounds(195, 31, 86, 14);
		add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(43, 68, 46, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(195, 65, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Género");
		lblNewLabel.setBounds(43, 116, 56, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(195, 112, 108, 22);
		add(comboBox);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(162, 187, 89, 23);
		add(btnNewButton);
	}
}
