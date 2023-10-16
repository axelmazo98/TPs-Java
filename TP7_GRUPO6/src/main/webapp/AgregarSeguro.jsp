<%@ page import="dominio.tipoSeguro" %>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar Seguros</title>
</head>

<body>

<%
	List<tipoSeguro> listaTipos=new ArrayList<tipoSeguro> ();
	int Id=0;

	if(request.getAttribute("cargar")!=null){
		listaTipos = (List<tipoSeguro>)request.getAttribute("cargar");
	}
	
	if(request.getAttribute("id")!=null)
		Id=(int)request.getAttribute("id");
	

%>

	<a href="Inicio.jsp">Inicio</a>
	<a href="ServletSeguros?Param=cargarTipo">Agregar seguro</a>
	<a href="ServletSeguros?Param=listarSeguros">Listar segurso</a>
	
	<br> <br> <br>
	<form method="post" action="ServletSeguros">
	
		Id Seguro: <%=Id %><br> <br>
		Descripción: <input type= 'text' name= 'txtDescripcion' required></input> <br> <br>
		Tipo Seguro: <select name='ddlTipoSeguro'> 
			<%
			if(listaTipos!=null){
				for(tipoSeguro tipo : listaTipos){
					%>
				<option value="<%=tipo.getIdTipo()%>"><%=tipo.getDescripcion() %> </option>
				<%	
				}
			}
		%>
		
		</select> <br> <br>
			
		Costo Contratación: <input type= 'text' name= 'txtCostoContratacion'></input> <br> <br>
		Costo Máximo Asegurado: <input type= 'text' name= 'txtCostoMaximoAsegurado'></input> <br> <br>
		<button type='submit' name=btnAceptar style="width: 120px;">Aceptar</button>
		
		</form>
		
		
</body>
</html>