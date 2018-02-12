<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercício 3</title>
</head>
<body>
	<fieldset style="width: 200px">
		<legend>Informação Data Nascimento</legend>
		<form action="Exercicio3Servlet" method="post">
			<table>
				<tr>
					<td><input type="text" name="data"
						id="data" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Enviar"></td>
				</tr>
			</table>
		</form>
		<script src="https://code.jquery.com/jquery-2.2.3.min.js"
			type="text/javascript"></script>
		<script src="../js/jquery.maskedinput.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			jQuery(function($) {
				$("#data").mask("99/99/9999");
			});
		</script>

	</fieldset>
</body>
</html>