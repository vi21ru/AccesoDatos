<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tienda DAM</title>
<link href="estilos/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<header>
<h1>Tienda DAM</h1>
</header>
<section class="main" id="main">
		
		<div id="content">
			<img src="imagenes/amazon.png">
			<h3>Bienvenido a la Tienda de DAM.</h3>
		<form action="ServletCompra.java" method="post">

		<span class="texto_normal">Listado productos: </span><select name="listaProducto" class="texto_normal">
		
		<%
			for(int i = 0; i < 19; i++){
				Random alea = new Random();%>
				<option value="Producto<%=i+1%>"> Producto - <%=i+1%> --> <%=alea.nextInt(100)%></option> 
	
			<%}%>
		
		</select> 
		<span class="texto_normal">Unidades:</span><input type="text" class="texto_normal" name="num_unidades"><br />

		<input type="submit" name="inicio" class="small_button" value="Añadir"/>
		</form>
		
	</div>
	</section>
</body>
</html>