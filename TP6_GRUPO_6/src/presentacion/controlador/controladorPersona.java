package presentacion.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.MouseListener;


import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Entidades.Persona;
import Negocio.IPersonaNegocio;
import presentacion.vista.PanelAgregarPersonas;
import presentacion.vista.PanelEliminarPersona;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.PanelModificarPersonas;
import presentacion.vista.VentanaPrincipal;

public class controladorPersona implements ActionListener, MouseListener{
	private JPanel contentPane;
	private VentanaPrincipal ventanaPrincipal;
	private PanelAgregarPersonas panelAgregarPersonas;
	private PanelEliminarPersona eliminarPersona;
	private PanelModificarPersonas panelModificarPersonas;
	private PanelListarPersonas panelListarPersonas;
	private static DefaultListModel<Persona> listModel;
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
		this.ventanaPrincipal.getMiAgregar().addActionListener(a->cambiarPanel(a,1));	
		
		this.ventanaPrincipal.getMenuModificar().addActionListener(a->cambiarPanel(a,2));
		
		this.ventanaPrincipal.getMenuEliminar().addActionListener(a->cambiarPanel(a,3));
		
		this.ventanaPrincipal.getMenuListar().addActionListener(a->cambiarPanel(a,4));
		
		this.contentPane=ventanaPrincipal.getContentPane();	
		
		//LISTADO
		this.panelAgregarPersonas.getBtnAceptar().addActionListener(a->agregarPersona(a));
		this.panelModificarPersonas.getBtnModificar().addActionListener(a->modificarPersona(a));	
		this.eliminarPersona.getBtnEliminar().addActionListener(a->eliminarPersona(a));
		
		this.panelModificarPersonas.getListModificar().addMouseListener(this);
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
	
	public void cambiarPanel(ActionEvent a, int panel) {
		contentPane.removeAll();
		listModel = new DefaultListModel<Persona>();
		cargarUsuarios();
		switch (panel) {
			case 1:
				contentPane.add(panelAgregarPersonas);
				break;
			case 2:
				contentPane.add(panelModificarPersonas);
				panelModificarPersonas.getListModificar().setModel(listModel);
				break;
			case 3:
				contentPane.add(eliminarPersona);
				eliminarPersona.getListEliminar().setModel(listModel);
				break;
			case 4:			
				llenarTabla();
				contentPane.add(panelListarPersonas);
				break;
		}
		contentPane.repaint();
		contentPane.revalidate();
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
	private void llenarTabla() {
		DefaultTableModel modelTabla = new DefaultTableModel();
		modelTabla.addColumn("DNI");
		modelTabla.addColumn("Nombre");
		modelTabla.addColumn("Apellido");
		ArrayList<Persona> pList= new ArrayList<Persona>();
		pList = neg.readALL();
		String [] fila = new String[3];
		for (Persona p : pList) {	
			fila[0] = p.getDni();
			fila[1] = p.getNombre();
			fila[2] = p.getApellido();
			modelTabla.addRow(fila);	
		}
		panelListarPersonas.getjtListaPersonas().setModel(modelTabla);
	}
	
	public void modificarPersona(ActionEvent a) {
		   String dni = this.panelModificarPersonas.getTxtDni().getText();
		    String nombre = this.panelModificarPersonas.getTxtNombre().getText();
		    String apellido = this.panelModificarPersonas.getTxtApellido().getText();
		    Persona p1 = new Persona(dni, nombre, apellido);

		    String mensaje=neg.modify(p1);
		    JOptionPane.showMessageDialog(null, mensaje);
		    
		    listModel = new DefaultListModel<Persona>();
		    cargarUsuarios();
		    panelModificarPersonas.getListModificar().setModel(listModel);
		    
		    this.panelModificarPersonas.getTxtDni().setText("");
			this.panelModificarPersonas.getTxtNombre().setText("");
			this.panelModificarPersonas.getTxtApellido().setText("");
	}
	
	private void eliminarPersona(ActionEvent a) {
		Persona p = (Persona) eliminarPersona.getListEliminar().getSelectedValue();
		String mensaje = neg.delete(p);
		JOptionPane.showMessageDialog(null, mensaje);
		
		listModel = new DefaultListModel<Persona>();
		 cargarUsuarios();
		 eliminarPersona.getListEliminar().setModel(listModel);
	}
	
	public void cargarUsuarios() {
		ArrayList<Persona> usuarios = neg.readALL();
        for (Persona persona : usuarios) {
            listModel.addElement(persona);
        }
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Persona p = (Persona) panelModificarPersonas.getListModificar().getSelectedValue();
		panelModificarPersonas.getTxtNombre().setText(p.getNombre());
		panelModificarPersonas.getTxtApellido().setText(p.getApellido());
		panelModificarPersonas.getTxtDni().setText(p.getDni());
	}
	
	public void inicializar()
	{
		this.ventanaPrincipal.setVisible(true);;
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
