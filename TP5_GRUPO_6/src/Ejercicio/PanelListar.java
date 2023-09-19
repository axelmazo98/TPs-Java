package Ejercicio;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;

public class PanelListar extends JPanel {
	
	private JLabel lblPeliculas;
	private JList list;
	
	public PanelListar() {
		
		setLayout(null);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(57, 127, 46, 14);
		add(lblPeliculas);
		
		list = new JList();
		list.setBounds(146, 60, 270, 190);
		add(list);
	}
}
