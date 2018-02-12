package br.com.treinaweb.exercicios;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercicio2Servlet
 */
@WebServlet(name = "Exercicio2Servlet", urlPatterns = { "/exercicio2" })
public class Exercicio2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Exercicio2Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tabela = null;
		tabela = "<table>";
		tabela += "<tr>";
		tabela += "<td>Valor 1</td>";
		tabela += "<td>Valor 2</td>";
		tabela += "<td>Valor 3</td>";
		tabela += "<td>Soma</td>";
		tabela += "<td>Média</td>";
		tabela += "</tr>";

		Random ran = new Random();
		double valor1 = 0, valor2 = 0, valor3 = 0, somaTotal = 0, mediaTotal = 0;
		for (int i = 0; i < 28; i++) { // linhas
			tabela += "<tr>";
			double soma = 0, media = 0.0;
			// colunas
			for (int j = 0; j < 3; j++) {
				int valor = ran.nextInt(11);// retorna valors de 0 a 10;
				tabela += "<td>" + valor + "</td>";
				soma += valor;

				if (j == 0)
					valor1 += valor;
				if (j == 1)
					valor2 += valor;
				if (j == 2)
					valor3 += valor;
			}
			media = soma / 3.0;
			tabela += "<td>" + soma + "</td>";
			tabela += "<td>" + media + "</td>";
			tabela += "</tr>";
			somaTotal += soma;
			mediaTotal += media;

		}
		tabela += "<tr>";
		tabela += "<td><strong>" + valor1 + "</strong></td>";
		tabela += "<td><strong>" + valor2 + "</strong></td>";
		tabela += "<td><strong>" + valor3 + "</strong></td>";
		tabela += "<td><strong>" + somaTotal + "</strong></td>";
		tabela += "<td><strong>" + mediaTotal + "</strong></td>";
		tabela += "</tr>";
		tabela += "</table>";

		response.getWriter().write("<html>");
		response.getWriter().write("	<head>");
		response.getWriter().write("		<title>Exercício 2 - Servlet</title>");
		response.getWriter().write("	</head>");
		response.getWriter().write("	<body>");
		response.getWriter().write("		<h1>Exercício 2</h1>");
		response.getWriter().write(tabela);
		response.getWriter().write("	</body>");
		response.getWriter().write("</html>");
	}

}
