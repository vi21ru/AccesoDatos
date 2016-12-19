
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="estilos/style.css" rel="stylesheet" type="text/css">
<title>Acceso a tienda</title>
</head>
<body>
<header>
<h1>Tienda DAM</h1>
</header>
<section class="main" id="main">
		
		<div id="content">
			<img src="imagenes/amazon.png">
		<form action="ServletValidacion.java" method="post">
		<input type="text" placeholder="Nombre Usuario"  class="text" name="user"/><br>
		<input type="text" placeholder="*************"  class="text" name="password"/><br>
		<input type="checkbox" name="recuerda"/> recuerdame<br>
		<input type="submit" name="inicio" class="big_button" value="Acceso a Tienda DAM"/>
		</form>
		
	</div>
	</section>
</body>
</html>