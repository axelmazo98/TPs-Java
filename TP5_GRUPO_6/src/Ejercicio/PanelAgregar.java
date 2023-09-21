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
	private JLabel lbl_ID;
	private JLabel lblId;
	private JLabel lblNombre;
	private JLabel lblNewLabel;
	private JComboBox<Generos> comboBoxGenero;
	private JButton btnNewButton;
	
	private DefaultListModel<Peliculas> lmAgregar;
	
	/**
	 * Create the panel.
	 */
	public PanelAgregar(DefaultListModel<Peliculas> listModel) {
		setLayout(null);
		lmAgregar=listModel;
		
		lbl_ID = new JLabel("ID");
		lbl_ID.setBounds(43, 31, 46, 14);
		add(lbl_ID);
		
		lblId = new JLabel("ID ejemplo: 1");
		
		lblId.setText(String.valueOf(lmAgregar.getSize()+1)) ;
		lblId.setBounds(195, 31, 86, 14);
		add(lblId);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(43, 68, 46, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(195, 65, 245, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		lblNewLabel = new JLabel("Género");
		lblNewLabel.setBounds(43, 116, 56, 14);
		add(lblNewLabel);
		
		comboBoxGenero = new JComboBox<Generos>();
		comboBoxGenero.setBounds(195, 112, 245, 22);
		add(comboBoxGenero);
		comboBoxGenero.addItem(new Generos("Seleccione un genero"));
		comboBoxGenero.addItem(new Generos("Terror"));
		comboBoxGenero.addItem(new Generos("Accion"));
		comboBoxGenero.addItem(new Generos("Suspenso"));
		comboBoxGenero.addItem(new Generos("Romántica"));
		
		btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNombre.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "El campo 'Nombre' no puede estar en blanco ");
				}
				else if(comboBoxGenero.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un 'Género'");
				}
				else {
					Peliculas pelicula= new Peliculas();
					pelicula.setId(Integer.parseInt(lblId.getText()));
					pelicula.setNombre(txtNombre.getText());
					pelicula.setGenero((Generos)comboBoxGenero.getSelectedItem());
					
					lmAgregar.addElement(pelicula);
					
					JOptionPane.showMessageDialog(null, "Pelicula agregada correctamente");
					lblId.setText(String.valueOf(lmAgregar.getSize()+1)) ;
				}
			}
		});
		btnNewButton.setBounds(167, 199, 181, 32);
		add(btnNewButton);
	}
	
	
}
