<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar Seguros</title>
</head>

<body>

	<a href="Inicio.jsp">Inicio &nbsp;</a> <a href="AgregarSeguros.jsp">Agregar Seguros &nbsp;</a> <a href="ListarSeguros.jsp"> Listar Seguros &nbsp;</a><br> <br> <br>
		Id Seguro: ultimoId <br> <br>
		Descripción: <input type= 'text' name= 'txtDescripcion' required></input> <br> <br>
		Tipo Seguro: <select name='ddlTipoSeguro'> 
		</select> <br> <br>
			
		Costo Contratación: <input type= 'text' name= 'txtCostoContratacion'></input> <br> <br>
		Costo Máximo Asegurado: <input type= 'text' name= 'txtCostoMaximoAsegurado'></input> <br> <br>
		<button type='submit' name=btnAceptar style="width: 120px;">Aceptar</button>
</body>
</html>