<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>El Fotograma Perdido MVC v1 DS</title>
</head>
<body>

<form action="controlador" method="post">
<input type="hidden" name="accion" value="login">
Si ya es usuario de la aplicación, introduzca login y clave<br> 
Login: <input name="login" value="login"> <br>
Clave: <input name="clave" value="clave" type="password">
<input name="login" value="login"
	type="submit" style="width: 84px; height: 33px">
</form>
<form action="controlador" method="post">
<input type="hidden" name="accion" value="registrar">
Si aún no es usuario de la aplicación:  <br>
<input name="registrar" value="registrar"
	type="submit" style="width: 84px; height: 33px">
</form>

<hr>


	<br>

	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<label for="login2">Login usuario:</label><input id="login2" type="text" name="login" maxlength="12" placeholder="Máximo 12" required="required" pattern="\S*"><br>
		<label for="clave">Clave:</label><input id="clave" type="password" name="clave" maxlength="12" placeholder="Máximo 12" required="required" autocomplete="off" pattern="\S*"><br>
		<input type="hidden" name="accion" value="login">
		<input type="submit" value="Login">
	</form>
	
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<label for="login2">Login usuario:</label><input id="login2" type="text" name="login" maxlength="12" placeholder="Máximo 12" required="required" pattern="\S*"><br>
		<label for="clave">Clave:</label><input id="clave" type="password" name="clave" maxlength="12" placeholder="Máximo 12" required="required" autocomplete="off" pattern="\S*"><br>
		<input type="hidden" name="accion" value="registro">
		<input type="submit" value="Registro">
	</form>
	
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<input type="hidden" name="accion" value="index">
		<input type="submit" value="Volver al inicio">
	</form>
	
	<form action="/fperdidoLanzaMunoz/controlador" method="post">
		<input type="hidden" name="accion" value="consultarAnonimo">
		<input type="submit" value="Consulta Ranking">
	</form>
	
</body>
</html>