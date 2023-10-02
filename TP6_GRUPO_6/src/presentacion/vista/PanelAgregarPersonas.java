package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPersonas extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JButton btnAceptar;

	public PanelAgregarPersonas() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 27, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(28, 63, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(28, 103, 46, 14);
		add(lblDni);
		
		txtNombre = new JTextField();
		ValidarTipoDeDatoString(txtNombre);
		txtNombre.setBounds(141, 24, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		ValidarTipoDeDatoString(txtApellido);
		txtApellido.setBounds(141, 60, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDni = new JTextField();
		ValidarTipoDatoInt(txtDni);
		txtDni.setBounds(141, 100, 86, 20);
		add(txtDni);
		txtDni.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(28, 140, 123, 20);
		add(btnAceptar);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public JTextField getTxtDni() {
		return txtDni;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
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
	
	public void ValidarTipoDatoInt(JTextField txtField) {
		txtField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ((Character.isLetter(c) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_DELETE))) {
                    e.consume(); // Ignorar el evento si no es un numero
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
}