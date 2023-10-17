<%@page import="java.util.List"%>
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
	<a href="Inicio.jsp">Inicio &nbsp;</a> <a href="AgregarSeguro.jsp">Agregar Seguros &nbsp;</a> <a href='ListarSeguros.jsp'> Listar Seguros &nbsp;</a><br> <br> <br>
	
	<h1>Tipo de seguros en la base de datos</h1>
	
	<form method="get" action="ServletSeguros">
		<label for="seguroDropdown">B�squeda de tipo de seguros:</label>
	    <select name="seguros">
	        <option value="seguroCasas">Seguro de casas</option>
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
            <th>Descripci�n seguro</th>
            <th>Descripci�n tipo seguro</th>
            <th>Costo contrataci�n</th>
            <th>Costo m�ximo asegurado</th>
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