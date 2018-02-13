package br.com.treinaweb.jee.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinaweb.jee.dao.UsuarioDAO;
import br.com.treinaweb.jee.models.Usuario;

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(name = "ServletLogin", urlPatterns = { "/login" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext contexto;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		contexto = config.getServletContext();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nomeUsuario");
		String senha = request.getParameter("senha");
		try {
			
			Usuario usuario = UsuarioDAO.autenticar(nome, senha);
			if (usuario != null) {
				contexto.setAttribute("usuarioLogado", usuario);
				Cookie cookie = new Cookie("nomeUsuarioLogado", usuario.getNome());
				cookie.setMaxAge(3600);
				response.addCookie(cookie);
				request.getSession().setAttribute("usuario", usuario);
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("loginIncorreto.jsp");
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			response.sendRedirect("loginIncorreto.jsp");
		}
	}

}
