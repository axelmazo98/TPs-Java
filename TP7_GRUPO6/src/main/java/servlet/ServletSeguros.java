package servlet;

import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Seguro;
import dominio.tipoSeguro;
import negocioImpl.SeguroNegocioImpl;
import negocioImpl.TipoSeguroNegocioImpl;

/**
 * Servlet implementation class ServletSeguros
 */
@WebServlet("/ServletSeguros")
public class ServletSeguros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SeguroNegocioImpl segNegocio=new SeguroNegocioImpl();
	private TipoSeguroNegocioImpl tipoNegocio=new TipoSeguroNegocioImpl();
  
    public ServletSeguros() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("Param")!=null) {
			
			String opcion=request.getParameter("Param").toString();	
			
			  switch (opcion) { 
			  
				  case "cargarTipo":
				  
					  request.setAttribute("cargar" ,tipoNegocio.listarTipos());
					  request.setAttribute("id", segNegocio.getProximoId());
					  
					  RequestDispatcher dispatcher =
					  request.getRequestDispatcher("/AgregarSeguro.jsp");
					  dispatcher.forward(request, response); 
					  break;
				  
				  case "listarSeguros":
				  
					  SeguroNegocioImpl seguroNegocioImpl = new SeguroNegocioImpl(); List<Seguro>
					  list = seguroNegocioImpl.getSeguros();
					  
					  request.setAttribute("listSeguros", list);
					  request.setAttribute("cargar2", tipoNegocio.listarTipos());
					  
					  RequestDispatcher dispa = request.getRequestDispatcher("/ListarSeguros.jsp");
					  dispa.forward(request, response);
					  break; 
				  default:
						 break;
			  }
			 	
		}
		if(request.getParameter("btnFiltrar")!=null)
		{
			SeguroNegocioImpl seguroNegocioImpl = new SeguroNegocioImpl(); List<Seguro>
			list = seguroNegocioImpl.getSegurosFiltro(Integer.parseInt(request.getParameter("ddlTipoSeguro")));
			request.setAttribute("listSeguros", list);
			RequestDispatcher dp= request.getRequestDispatcher("/ListarSeguros.jsp");
			dp.forward(request,response);
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("btnAceptar")!=null) {
			
			Seguro seguro= new Seguro();
			
			seguro.setDescripcion(request.getParameter("txtDescripcion"));
			seguro.setTipo(new tipoSeguro(Integer.parseInt( request.getParameter("ddlTipoSeguro"))));
			seguro.setCostoContratacion(Float.parseFloat( request.getParameter("txtCostoContratacion")));
			seguro.setCostoMaximo(Float.parseFloat( request.getParameter("txtCostoMaximoAsegurado")));
			
			boolean guardado= true;
			
			guardado= segNegocio.agregarSeguro(seguro);
			
			request.setAttribute("estado", guardado);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Inicio.jsp");
			dispatcher.forward(request, response);
			
		}
		
	}

}
