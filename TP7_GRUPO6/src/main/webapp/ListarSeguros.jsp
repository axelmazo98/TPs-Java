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
	<a href="Inicio.jsp">Inicio &nbsp;</a> <a href="AgregarSeguros.jsp">Agregar Seguros &nbsp;</a> <a href='ListarSeguros.jsp'> Listar Seguros &nbsp;</a><br> <br> <br>
	
	<h1>Tipo de seguros en la base de datos</h1>
    <label for="seguroDropdown">Búsqueda de tipo de seguros:</label>
    <select id="seguroDropdown">
        <option value="seguroCasas">Seguro de casas</option>
    </select>
    <button id="filtrarButton">Filtrar</button>
    
    <table>
        <tr>
            <th>ID Seguro</th>
            <th>Descripción seguro</th>
            <th>Descripción tipo seguro</th>
            <th>Costo contratación</th>
            <th>Costo máximo asegurado</th>
        </tr>
        <tr>
            <td>1</td>
            <td>Es un seguro de salud para intervenciones quirurgicas de alta complejidad, a un costo accesible.</td>
            <td>Seguro de casas</td>
            <td>$600</td>
            <td>$15,000</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Asegura toda la gama de motocicletas de uso particular, desde motos y ciclomotores hasta deportivas: street, custom, enduro, scooter y choperas, entre otras.</td>
            <td>Seguro de Motos</td>
            <td>$1200</td>
            <td>$28,000</td>
        </tr>
    </table>
</body>
</html>