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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import net.miginfocom.swing.MigLayout;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class PanelListarPersonas extends JPanel {
	private JTable jtListaPersonas;

	/**
	 * Create the panel.
	 */
	public PanelListarPersonas() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblLista = new JLabel("Lista Personas");
		lblLista.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblLista, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		jtListaPersonas = new JTable();
		jtListaPersonas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "DNI" 
			}
		));
		scrollPane.setViewportView(jtListaPersonas);
	}
}
