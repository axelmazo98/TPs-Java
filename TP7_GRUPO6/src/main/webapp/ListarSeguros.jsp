<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="dominio.tipoSeguro" %>
<%@page import="dominio.Seguro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Seguros</title>
<style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid #000;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<% 
	ArrayList<tipoSeguro> listaTipos=new ArrayList<tipoSeguro> ();
	
	if(request.getAttribute("cargar2")!=null){
		listaTipos = (ArrayList<tipoSeguro>)request.getAttribute("cargar2");
	}
%>
	
	<a href="Inicio.jsp">Inicio &nbsp;</a> 
	<a href="ServletSeguros?Param=cargarTipo">Agregar seguro</a>
	<a href="ServletSeguros?Param=listarSeguros">Listar segurso</a><br> <br> <br>
	
	<h1>Tipo de seguros en la base de datos</h1>
	
	<form method="get" action="ServletSeguros">
		<label for="seguroDropdown">Búsqueda de tipo de seguros:</label>
	    <select name="ddlTipoSeguro">
	    	<%
			if(listaTipos!=null){
			%>
				<option value="0">Selecciona Tipo Seguro</option>
				<%
				for(tipoSeguro tipo : listaTipos){
				%>
				<option value="<%=tipo.getIdTipo()%>"><%=tipo.getDescripcion() %> </option>
				<%}%>
			<%}%>
				
	    </select>
		<input type="submit" name="btnFiltrar" value="Filtrar"/>
	</form>
	
	 <% 
	    List<Seguro> listSeguros = null;
	    if(request.getAttribute("listSeguros") != null){
	    	listSeguros = (List<Seguro>)request.getAttribute("listSeguros");
	    }
    	
    %>
	
    
    <table>
        <tr>
            <th>ID Seguro</th>
            <th>Descripción seguro</th>
            <th>Descripción tipo seguro</th>
            <th>Costo contratación</th>
            <th>Costo máximo asegurado</th>
        </tr>
        <% if(listSeguros != null ){
        	for(Seguro x : listSeguros){ 
        %>
        	
        	<tr>
	            <td><%=x.getID()%></td>
	            <td><%=x.getDescripcion() %></td>
 	            <td><%=x.getTipo().getDescripcion() %></td>
	            <td><%=x.getCostoContratacion() %></td>
	            <td><%=x.getCostoMaximo() %></td>
        	</tr>
        <%}} %>
    </table>
</body>
</html>