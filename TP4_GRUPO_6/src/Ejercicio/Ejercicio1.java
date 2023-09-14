package Ejercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFechaNac;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setFont(new Font("Arial", Font.BOLD, 13));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 445);
		setTitle("Contactos");
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(68, 35, 83, 21);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(174, 35, 182, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(68, 95, 46, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(174, 92, 182, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(68, 148, 69, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(174, 145, 182, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fec. Nacimiento");
		lblFechaNac.setBounds(68, 202, 96, 14);
		contentPane.add(lblFechaNac);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(174, 199, 182, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		JLabel lblMostrarDatos = new JLabel("Los datos ingresados fueron: ");
		lblMostrarDatos.setBounds(68, 288, 318, 97);
		contentPane.add(lblMostrarDatos);
		
		JLabel lblError = new JLabel("");
		lblError.setBounds(65, 329, 321, 14);
		contentPane.add(lblError);
		
		
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Boolean completos = true;
				lblError.setText("Ingrese datos en todos los campos");
				lblMostrarDatos.setText("");
				if(txtNombre.getText().isEmpty()) {
					txtNombre.setBackground(Color.red);
					completos = false;
				}
				else txtNombre.setBackground(Color.WHITE);
				if(txtApellido.getText().isEmpty()) {
					txtApellido.setBackground(Color.red);
					completos = false;
				}
				else txtApellido.setBackground(Color.WHITE);
				if(txtTelefono.getText().isEmpty()) {
					txtTelefono.setBackground(Color.red);
					completos = false;
				}
				else txtTelefono.setBackground(Color.WHITE);
				if(txtFechaNac.getText().isEmpty()) {
					txtFechaNac.setBackground(Color.red);
					completos = false;
				}
				else txtFechaNac.setBackground(Color.WHITE);
					
				if(completos)
				{
				lblMostrarDatos.setText("<html> Los datos ingresados fueron: " + "<br>"  + "Nombre: " + txtNombre.getText() + "<br>" + "Apellido: " + txtApellido.getText() +
						"<br>" + "Telefono: " + txtTelefono.getText() + "<br>"+ "Fecha de nacimiento: " + txtFechaNac.getText() + "</html>" );
				txtApellido.setText("");
				txtFechaNac.setText("");
				txtNombre.setText("");
				txtTelefono.setText("");
				lblError.setText("");
				}
				}

			});

		btnMostrar.setBounds(252, 239, 104, 33);
		contentPane.add(btnMostrar);
		
		
		setVisible(true);
	}
}
