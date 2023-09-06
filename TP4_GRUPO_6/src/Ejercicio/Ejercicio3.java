package Ejercicio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;


public class Ejercicio3 extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		chckbxNewCheckBox.setBounds(187, 66, 97, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Administración");
		chckbxNewCheckBox_1.setBounds(187, 37, 97, 23);
		panel_1.add(chckbxNewCheckBox_1);
			
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Programación");
		chckbxNewCheckBox_2.setBounds(187, 7, 97, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		setVisible(true);
	}
}
