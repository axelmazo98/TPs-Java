package Ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;


public class Principal extends JFrame{
	
	private JPanel contentPane;
	private static DefaultListModel<Peliculas> listModel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					listModel= new DefaultListModel<Peliculas>();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 349);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Peliculas");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItemAgregarP = new JMenuItem("Agregar");
		menuItemAgregarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				contentPane.removeAll();
				PanelAgregar panel = new PanelAgregar(listModel);
				//panel.setDefaultListModel(listModel);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnNewMenu.add(menuItemAgregarP);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				PanelListar panel = new PanelListar(listModel);
				contentPane.add(panel);
				contentPane.revalidate();
				
			}
		});
		mnNewMenu.add(mntmListar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

        }
}
