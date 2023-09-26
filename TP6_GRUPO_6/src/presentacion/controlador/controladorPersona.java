package presentacion.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.PanelEliminarPersona;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.VentanaPrincipal;

public class controladorPersona implements ActionListener{
	private JPanel contentPane;
	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregarPersonas panelAgregarPersonas;
	private PanelEliminarPersona eliminarPersona;
	private PanelModificarPersonas panelModificarPersonas;
	
	
	public controladorPersona(VentanaPrincipal vista) {
		//Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		
		//Instancio los paneles
		panelAgregarPersonas= new PanelAgregarPersonas();
		eliminarPersona = new PanelEliminarPersona();
		panelModificarPersonas = new PanelModificarPersonas();
		
		//Eventos menu del Frame principal llamado Ventana
		this.ventanaPrincipal.getMiAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		
		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_EliminsrPersona(a));
		
		this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_ModificarPersona(a));
	}
	
	//EventoClickMenu abrir PanelAgregarPersonas
	public void  EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a)
	{		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(panelAgregarPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_EliminsrPersona(ActionEvent a)
	{		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(eliminarPersona);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void  EventoClickMenu_ModificarPersona(ActionEvent a)
	{		
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(panelModificarPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void inicializar()
	{
		this.ventanaPrincipal.setVisible(true);;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
