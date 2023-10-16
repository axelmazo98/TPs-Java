<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>

	<a href="Inicio.jsp">Inicio</a>
	<a href="ServletSeguros?Param=cargarTipo">Agregar seguro</a>
	<a href="ServletSeguros?Param=listarSeguros">Listar seguros</a>
	<div>
		<b>Soy página de inicio</b>
	</div>
	
	<%
		if (request.getAttribute("estado") != null) {
	%>
	Articulo agregado con exito
	<%
		}
	%>
</body>
</html>