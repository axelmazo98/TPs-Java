package Ejercicio;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public Main()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGrupo = new JLabel("GRUPO NRO: 6");
		lblGrupo.setFont(new Font("Arial", Font.PLAIN, 25));
		lblGrupo.setBounds(10, 0, 236, 60);
		contentPane.add(lblGrupo);
		
		JButton button1 = new JButton();
		button1.setText("Ejercicio 1");
		button1.setBounds(150,70,120,30);
		contentPane.add(button1);
		
		JButton button2 = new JButton();
		button2.setText("Ejercicio 2");
		button2.setBounds(150,120,120,30);
		contentPane.add(button2);
		
		JButton button3 = new JButton();
		button3.setText("Ejercicio 3");
		button3.setBounds(150,170,120,30);
		contentPane.add(button3);
		

	}

}
