package Ejercicio;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PanelListar extends JPanel {
	
	private JLabel lblPeliculas;
	private JList list;
	private DefaultListModel<Peliculas> lmListar;
	
	public PanelListar(DefaultListModel<Peliculas> listModel) {
		
		setLayout(null);
		
		lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setBounds(57, 127, 46, 14);
		add(lblPeliculas);
		
		
		
		list = new JList();
		
		//Collections.sort((List<String>)listModel);
		list.setModel(listModel);
		
		list.setBounds(146, 60, 270, 190);
		add(list);
	}
	
}
