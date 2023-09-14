package Ejercicio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;


public class Ejercicio3 extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtHoras;
	private final ButtonGroup grupoCheck = new ButtonGroup();

	public Ejercicio3() {
		setTitle("Seleccion Multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 28, 414, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		JLabel lblElijeUnSistema = new JLabel("Elije un sistema operativo");
		lblElijeUnSistema.setBounds(10, 13, 170, 23);
		panel.add(lblElijeUnSistema);
		
		JRadioButton radio1 = new JRadioButton("Windows ");
		radio1.setBounds(197, 13, 87, 23);
		panel.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Mac");
		radio2.setBounds(286, 13, 58, 23);
		panel.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Linux");
		radio3.setBounds(346, 13, 56, 23);
		panel.add(radio3);
		
		ButtonGroup grupo = new ButtonGroup();
		
		grupo.add(radio1);
		grupo.add(radio2);
		grupo.add(radio3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 90, 414, 104);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setBounds(28, 41, 138, 14);
		panel_1.add(lblEspecialidad);
		
		///CHECKBOXS
		JCheckBox chckbxNewCheckBox = new JCheckBox("Diseño Grafico");
		chckbxNewCheckBox.setBounds(187, 66, 131, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Administración");
		chckbxNewCheckBox_1.setBounds(187, 37, 112, 23);
		panel_1.add(chckbxNewCheckBox_1);
			
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Programación");
		chckbxNewCheckBox_2.setBounds(187, 7, 97, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel = new JLabel("Cantidad de horas en el  computador: ");
		lblNewLabel.setBounds(10, 213, 227, 14);
		contentPane.add(lblNewLabel);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(234, 210, 89, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setBounds(37, 253, 286, 16);
		contentPane.add(lblMensaje);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 238, 89, 23);
		contentPane.add(btnAceptar);
		
		/// Detecta cuando se realiza acción sobre radio button 1
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("");
			}
		});
		
		/// Detecta cuando se realiza acción sobre radio button 2
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("");
			}
		});
		
		/// Detecta cuando se realiza acción sobre radio button 3
		radio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("");
			}
		});
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("");
			}
		});
		
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("");
			}
		});
		
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("");
			}
		});
		
		// Detecta cuando se hace foco en el textbox
		txtHoras.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				lblMensaje.setText("");
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sistema=" ";
				String especialidades=" ";
				String horas= " ";
				//RADIOBUTTONS
				if(radio1.isSelected())sistema=radio1.getText();		
				if(radio2.isSelected())sistema=radio2.getText();	
				if(radio3.isSelected())sistema=radio3.getText();
				
				if(chckbxNewCheckBox.isSelected()) especialidades+= chckbxNewCheckBox.getText() + " - ";
				if(chckbxNewCheckBox_1.isSelected()) especialidades+= chckbxNewCheckBox_1.getText() + " - ";
				if(chckbxNewCheckBox_2.isSelected()) especialidades+= chckbxNewCheckBox_2.getText() + " - ";
				
				horas+= txtHoras.getText();
				
				if(!validarCampos()) {
					lblMensaje.setForeground(Color.red);;
					lblMensaje.setText("Debe completar todas las opciones");
				}
				else if(!soloNumeros(txtHoras.getText())) {
					lblMensaje.setForeground(Color.red);;
					lblMensaje.setText("Cantidad de horas debe contener valores numericos");
				}
				else {
					String mensaje=sistema + " - " + especialidades + horas + "Hs";					
					JOptionPane.showMessageDialog(null,mensaje);
				}
				
			}
			
			/// Valida que no haya campos vacíos.
			private boolean validarCampos() {
				
				if(grupo.getSelection() == null || (chckbxNewCheckBox.isSelected() == false && chckbxNewCheckBox_1.isSelected() == false && chckbxNewCheckBox_2.isSelected() == false) || txtHoras.getText().isEmpty()) {
					return false;
				}
				return true;
			}
			
			public boolean soloNumeros(String cadena) {
				
				try {
					Integer.parseInt(cadena);
					
					return true;
					
				} catch (Exception e) {
					return false;
				}
			}
			
			/*public void limpiarCampos() {
				grupo.clearSelection();
				txtHoras.setText("");
			}*/
		});
		
		setVisible(true);
	}
}
