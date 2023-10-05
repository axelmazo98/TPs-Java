package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class PanelModificarPersonas extends JPanel {
	
	private JList listModificar;
	private JLabel lblSeleccioneLaPersona;
	private JButton btnModificar;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDNI;
	/**
	 * Create the panel.
	 */
	public PanelModificarPersonas() {
		setLayout(null);
        lblSeleccioneLaPersona = new JLabel("Seleccione la persona que desea modificar");
        lblSeleccioneLaPersona.setBounds(37, 11, 286, 14);
        add(lblSeleccioneLaPersona);

        listModificar = new JList();
        listModificar.setBounds(37, 24, 353, 163);
        add(listModificar);

        txtNombre = new JTextField();
        txtNombre.setBounds(37, 199, 86, 20);
        ValidarTipoDeDatoString(txtNombre);
        add(txtNombre);
        txtNombre.setColumns(10);

        txtApellido = new JTextField();
        txtApellido.setBounds(133, 199, 86, 20);
        ValidarTipoDeDatoString(txtApellido);
        add(txtApellido);
        txtApellido.setColumns(10);

        txtDNI = new JTextField();
        txtDNI.setEnabled(false);
        txtDNI.setBounds(229, 199, 86, 20);
        add(txtDNI);
        txtDNI.setColumns(10);

        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(325, 198, 89, 23);
        add(btnModificar);

	}
	public void ValidarTipoDeDatoString(JTextField txtField) {
		
		txtField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
             // Verificar si el carácter es una letra o un espacio en blanco
                if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE ||
                        (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume(); // Ignorar el evento si no es una letra o espacio
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // No necesitas implementar este método, pero debe estar presente debido a la interfaz KeyListener
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // No necesitas implementar este método, pero debe estar presente debido a la interfaz KeyListener
            }
        });
		
}
	
	public JList getListModificar() {
		return listModificar;
	}

	public JLabel getLblSeleccioneLaPersona() {
		return lblSeleccioneLaPersona;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDNI;
	}
	
	public JButton getBtnModificar() {
		return btnModificar;
	}
}