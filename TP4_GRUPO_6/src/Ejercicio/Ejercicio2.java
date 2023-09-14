package Ejercicio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtCondicion;
	private JTextField txtPromedio;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Promedio");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(38, 11, 247, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1: ");
		lblNewLabel.setBounds(20, 40, 83, 14);
		panel.add(lblNewLabel);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(100, 37, 86, 20);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setBounds(21, 64, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3:");
		lblNewLabel_2.setBounds(20, 88, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(99, 60, 86, 20);
		panel.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(99, 83, 86, 20);
		panel.add(txtNota3);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(20, 117, 46, 14);
		panel.add(lblTps);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(100, 114, 86, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(38, 180, 247, 81);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Condición:");
		lblNewLabel_4.setBounds(21, 64, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(99, 60, 86, 20);
		panel_1.add(txtCondicion);
		txtCondicion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Promedio:");
		lblNewLabel_5.setBounds(21, 80, 74, 14);
		panel_1.add(lblNewLabel_5);
		
		txtPromedio = new JTextField();
		txtPromedio.setColumns(10);
		txtPromedio.setBounds(105, 44, 86, 20);
		panel_1.add(txtPromedio);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(317, 72, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(317, 117, 89, 23);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(317, 162, 89, 23);
		contentPane.add(btnSalir);
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNota1.setText("");
				txtNota2.setText("");
				txtNota3.setText("");
				txtPromedio.setText("");
				txtCondicion.setText("");
				comboBox.setSelectedItem("Aprobado");
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnCalcular.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(validarCampos()) {
					System.out.println("COMPLETE LOS CAMPOS DE NOTAS");
										
				}
				else if (!datosNumericos()) {
					System.out.println("Los datos ingresados deben ser numericos");
				}
				else if(!datos1a10()) {
					System.out.println("Las notas ingresedas deben ir del 1 al 10");
					
				}
					else {
						txtCondicion.setText(condicion());	
						txtPromedio.setText(String.format("%.2f", getPromedio()));
						
					}
				
			}
			
			public double getPromedio() {
							
				return  (Float.parseFloat(txtNota1.getText()) + Float.parseFloat(txtNota2.getText()) + Float.parseFloat(txtNota3.getText())) /3;
				
				
			}
			
			// Función que devuelve en un String la condición del alumno según los requisitos.
			private String condicion() {
				
					// Chequea si el item seleccionado tiene como texto "Desaprobado". Caso correcto devuelve condición de LIBRE.
					if(comboBox.getSelectedItem() == "Desaprobado") {
						return "Libre";
					}
					
					// Chequea si alguna de las notas es ,emos a 6 y devuelve la consición de LIBRE.
					if(Float.parseFloat(txtNota1.getText()) < 6 || Float.parseFloat(txtNota2.getText()) < 6 || Float.parseFloat(txtNota3.getText()) < 6) {
						return "Libre";
					}
					
					// Chequea si alguna de las notas es menor a 8 y devuelve la condición de REGULAR.
					if(Float.parseFloat(txtNota1.getText()) < 8 || Float.parseFloat(txtNota2.getText()) < 8 || Float.parseFloat(txtNota3.getText()) < 8) {
						return "Regular";
					}
					
					return "Promocionado";
			}
			
		private boolean datosNumericos() {
			
			boolean datos= true;
			
			String nota1= txtNota1.getText();
			String nota2= txtNota2.getText();
			String nota3= txtNota3.getText();
			
			for (int i = 0; i < nota1.length(); i++) {
				if(Character.isLetter(nota1.charAt(i))) {
					datos= false;
				}				
			}
			for (int i = 0; i < nota2.length(); i++) {
				if(Character.isLetter(nota2.charAt(i))) {
					datos= false;
				}				
			}
			for (int i = 0; i < nota3.length(); i++) {
				if(Character.isLetter(nota3.charAt(i))) {
					datos= false;
				}				
			}
			
			return datos;
		}
		
		private boolean datos1a10() {
			
			float nota1= Float.parseFloat(txtNota1.getText());
			float nota2= Float.parseFloat(txtNota2.getText());
			float nota3= Float.parseFloat(txtNota3.getText());
			
			if((nota1 >=1 && nota1 <=10) && (nota2 >=1 && nota2 <=10) && (nota3 >=1 && nota3 <=10)) {
				return true;
			}
			
			return false;
		}
			
		private boolean validarCampos() {
			return txtNota1.getText().isEmpty() ||
		           txtNota2.getText().isEmpty() ||
		           txtNota3.getText().isEmpty();
		   }
		
		});
		
		setVisible(true);
	}
	
}
