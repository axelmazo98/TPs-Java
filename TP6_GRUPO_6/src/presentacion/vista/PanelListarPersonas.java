package presentacion.vista;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;

public class PanelListarPersonas extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelListarPersonas() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblLista = new JLabel("Lista Personas");
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblLista, BorderLayout.NORTH);
		
		JList jlListarPersonas = new JList();
		add(jlListarPersonas, BorderLayout.CENTER);

	}
}
