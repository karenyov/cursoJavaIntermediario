<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<fieldset style="width: 200px">
		<form method="post" action="infoUsuario.jsp">
			<legend>Informa��es do usu�rio</legend>
			<div style="font-weight: bold">Nome completo:</div>
			<div>
				<input type="text" name="nomeCompleto">
			</div>
			<div style="font-weight: bold">Nome de usu�rio:</div>
			<div>
				<input type="text" name="nomeUsuario">
			</div>
			<div style="font-weight: bold">Senha:</div>
			<div>
				<input type="password" name="senha">
			</div>
			<div>
				<input type="submit" value="Enviar">
			</div>
		</form>
	</fieldset>


	<%!//M�todo para pegar a data atual
	public String getDataAtual() {
		return new Date().toString();
	}%>
	<h1>Curso de Java</h1>
	<%
		String mensagem = "";
		mensagem = "<b>Estou testando o JSP</b>";
		out.println(mensagem);
	%>
	<p>
		A data atual �
		<%=getDataAtual()%></p>
	<%
		String tabela = "";
		tabela = "<table>";
		for (int i = 0; i <= 10; i++) {
			int resultado = 2 * i;
			tabela += "<tr>";
			tabela += "<td>2 X " + i + " = </td>";
			tabela += "<td>" + resultado + "</td>";
			tabela += "</tr>";
		}
		tabela += "</table";
		out.println(tabela);

		out.println("<br />");

		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY);

		if (hora >= 6 && hora <= 12) {
			out.println("Bom dia!!! =D");
		} else if (hora > 12 && hora <= 18) {
			out.println("Boa tade!!! =D");
		} else if (hora > 18 && hora <= 24) {
			out.println("Boa noite!!! =D");
		} else {
			out.println("Boa madrugada!!! =D");
		}

		out.println("<br />");

		int mes = data.get(Calendar.MONTH) + 1;

		switch (mes) {
		case 1:
			out.println("� Janeiro!");
			break;
		case 2:
			out.println("� Feveiro!");
			break;
		case 3:
			out.println("� Mar�o!");
			break;
		case 4:
			out.println("� Abril!");
			break;
		case 5:
			out.println("� Maio!");
			break;
		case 6:
			out.println("� Junho!");
			break;
		case 7:
			out.println("� Julho!");
			break;
		case 8:
			out.println("� Agosto!");
			break;
		case 9:
			out.println("� Setembro!");
			break;
		case 10:
			out.println("� Outubro!");
			break;
		case 11:
			out.println("� Novembro!");
			break;
		case 12:
			out.println("� Dezembro!");
			break;
		}
	%>
</body>
</html>