<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exerc�cio 1</title>
</head>
<body>
	<%
		/*
		1- Crie uma p�gina JSP que imprime uma s�rie consecutiva de n�meros, de 0 a 50, onde cada linha
		deve exibir a soma quadrada dos n�meros anteriores. Por exemplo:
		1**2 = 1
		1**2 + 2*2 = 1 + 4 = 5
		1**2 + 2**2 + 3**2 = 1 + 4 + 9 = 14
		//e assim por diante.
		
		*/
		int soma = 0;
		String result = null;
		for (int i = 0; i <= 50; i++) {
			soma += i * i;
		}
		out.println(soma);
	%>

</body>
</html>