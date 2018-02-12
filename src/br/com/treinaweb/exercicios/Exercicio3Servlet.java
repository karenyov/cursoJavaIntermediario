package br.com.treinaweb.exercicios;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercicio3Servlet
 */
@WebServlet("/Exercicio3Servlet")
public class Exercicio3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Exercicio3Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String data = request.getParameter("data");
		Locale locale = new Locale("pt", "BR");
		SimpleDateFormat sdfEntrada = new SimpleDateFormat("dd/MM/yyyy", locale);
		sdfEntrada.setLenient(false);
		Date date;

		try {
			date = sdfEntrada.parse(data);
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(date);
			int dia_semana = cal.get(Calendar.DAY_OF_WEEK);

			response.getWriter().println("<html>");
			response.getWriter().println("	<head>");
			response.getWriter().println("		<title> Verificação de Idade </title>");
			response.getWriter().println("	</head>");
			response.getWriter().println("	<body>");
			response.getWriter().println("	<h3>Resultado:</h3>");

			switch (dia_semana) {
			case 1:
				response.getWriter().format("	<p>Você nasceu no Domingo");
				break;
			case 2:
				response.getWriter().format("	<p>Você nasceu na Segunda-Feira");
				break;
			case 3:
				response.getWriter().format("	<p>Você nasceu na Terça-Feira");
				break;
			case 4:
				response.getWriter().format("	<p>Você nasceu na Quarta-Feira");
				break;
			case 5:
				response.getWriter().format("	<p>Você nasceu na Quinta-Feira");
				break;
			case 6:
				response.getWriter().format("	<p>Você nasceu na Sexta-Feira");
				break;
			case 7:
				response.getWriter().format("	<p>Você nasceu no Sábado");
				break;
			}

			response.getWriter().println("	</body>");
			response.getWriter().println("</html>");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
