<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<fieldset style="width: 200px">
		<legend>Informa��o de Login</legend>
		<%
		request.getSession().setAttribute("forward", "login");
		%>
		<form action="forward.jsp" method="post">
			<div style="font-weight: bold">Nome de usu�rio:</div>
			<div>
				<input type="text" name="nomeUsuario" />
			</div>
			<div style="font-weight: bold">Senha:</div>
			<div>
				<input type="password" name="senha" />
			</div>
			<div>
				<input type="submit" value="Login" />
			</div>
		</form>
	</fieldset>
</body>
</html>