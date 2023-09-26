package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuItem miAgregar;
	private JMenuItem menuEliminar;
	private JMenuItem menuModificar;
	
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar mbPrincipal = new JMenuBar();
		setJMenuBar(mbPrincipal);
		
		JMenu mnPersona = new JMenu("Persona");
		mbPrincipal.add(mnPersona);
		
		miAgregar = new JMenuItem("Agregar");
		mnPersona.add(miAgregar);
		
		menuEliminar = new JMenuItem("Eliminar");
		mnPersona.add(menuEliminar);
		
		menuModificar = new JMenuItem("Modificar");
		mnPersona.add(menuModificar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JMenuItem getMiAgregar() {
		return miAgregar;
	}
	
	public JMenuItem getMenuEliminar() {
		return menuEliminar;
	}
	
	public JMenuItem getMenuModificar() {
		return menuModificar;
	}
}
