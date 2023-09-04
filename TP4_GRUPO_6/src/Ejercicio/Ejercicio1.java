package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio1() {
		setFont(new Font("Arial", Font.BOLD, 13));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Contactos");
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(68, 35, 83, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 35, 182, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(68, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 92, 182, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Teléfono");
		lblNewLabel_2.setBounds(68, 148, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 145, 182, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Fec. Nacimiento");
		lblNewLabel_3.setBounds(68, 202, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 199, 182, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		setVisible(true);
	}

}
