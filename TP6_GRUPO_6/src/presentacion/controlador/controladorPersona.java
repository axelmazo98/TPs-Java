package presentacion.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Entidades.Persona;
import Negocio.IPersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.PanelEliminarPersona;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.VentanaPrincipal;

public class controladorPersona implements ActionListener{
	private JPanel contentPane;
	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregarPersonas panelAgregarPersonas;
	private PanelEliminarPersona eliminarPersona;
	private PanelModificarPersonas panelModificarPersonas;
	private PanelListarPersonas panelListarPersonas;
	private IPersonaNegocio neg;
	
	
	public controladorPersona(VentanaPrincipal vista, IPersonaNegocio pNeg)  {
		//Guardo todas las instancias que recibo en el constructor
		this.ventanaPrincipal = vista;
		this.neg = pNeg;
		
		//Instancio los paneles
		panelAgregarPersonas= new PanelAgregarPersonas();
		eliminarPersona = new PanelEliminarPersona();
		panelModificarPersonas = new PanelModificarPersonas();
		panelListarPersonas = new PanelListarPersonas();
		
		//Eventos menu del Frame principal llamado Ventana
		this.ventanaPrincipal.getMiAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
		
		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->EventoClickMenu_EliminsrPersona(a));
		
		this.ventanaPrincipal.getMenuModificar().addActionListener(a->EventoClickMenu_ModificarPersona(a));
		
		this.ventanaPrincipal.getMenuListar().addActionListener(a->EventoClickMenu_ListarPersonas(a));
		
		//LISTADO
		this.panelAgregarPersonas.getBtnAceptar().addActionListener(a->agregarPersona(a));
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
	
	public void EventoClickMenu_ListarPersonas(ActionEvent a) {
		ventanaPrincipal.getContentPane().removeAll();
		ventanaPrincipal.getContentPane().add(panelListarPersonas);
		ventanaPrincipal.getContentPane().repaint();
		ventanaPrincipal.getContentPane().revalidate();
	}
	
	public void agregarPersona(ActionEvent a) {
		String dni = this.panelAgregarPersonas.getTxtDni().getText();
		String nombre = this.panelAgregarPersonas.getTxtNombre().getText();
		String apellido = this.panelAgregarPersonas.getTxtApellido().getText();
		Persona p1 = new Persona(dni, nombre, apellido);
		String mensaje=neg.insert(p1);
		
		this.panelAgregarPersonas.getTxtDni().setText("");
		this.panelAgregarPersonas.getTxtNombre().setText("");
		this.panelAgregarPersonas.getTxtApellido().setText("");
		
		JOptionPane.showMessageDialog(null, mensaje);
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
