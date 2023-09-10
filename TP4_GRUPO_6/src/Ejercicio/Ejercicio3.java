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


public class Ejercicio3 extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public Ejercicio3() {
		setTitle("Seleccion Multiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 310);
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
		lblNewLabel.setBounds(37, 213, 194, 14);
		contentPane.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 210, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sistema="";
				//RADIOBUTTONS
				if(radio1.isSelected())sistema=radio1.getText();		
				if(radio2.isSelected())sistema=radio2.getText();	
				if(radio3.isSelected())sistema=radio3.getText();	
				
				String mensaje=sistema;					
					JOptionPane.showMessageDialog(null,mensaje);
			}
		});
		btnAceptar.setBounds(335, 238, 89, 23);
		contentPane.add(btnAceptar);
		
		setVisible(true);
	}
}
