<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Usuario: <c:out value="${modelo.getLogin()}">hola</c:out></h4>
	
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<input type="hidden" name="accion" value="concursar">
		<input type="submit" value="Concursar" >
	</form><br/>
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<input type="hidden" name="accion" value="consultarRegistrado">
		<input type="submit" value="Consultar" >
	</form><br/>
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<input type="hidden" name="accion" value="salir">
		<input type="submit" value="Terminar">
	</form>	
</body>
</html>