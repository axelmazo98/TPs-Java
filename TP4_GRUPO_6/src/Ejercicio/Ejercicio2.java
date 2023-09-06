package Ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(44, 28, 247, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1: ");
		lblNewLabel.setBounds(20, 40, 83, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(100, 37, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setBounds(21, 64, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3:");
		lblNewLabel_2.setBounds(20, 88, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 60, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 83, 86, 20);
		panel.add(textField_2);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(20, 117, 46, 14);
		panel.add(lblTps);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(100, 114, 86, 20);
		panel.add(comboBox);
	}
}
