package servlets;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletValidacion
 */
@WebServlet("/ServletValidacion")
public class ServletValidacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Hashtable<String, String> usuarios = new Hashtable<String, String>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletValidacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext contexto = request.getServletContext();
		String user = request.getParameter("user");
		String pass = request.getParameter("password");

		// creamos el despachador
		RequestDispatcher despachador = request.getRequestDispatcher("/validacion.jsp");

		boolean userOK = false;

		// 2º comprobamos que hay tabla
		if (contexto.getAttribute("tabla") != null) {
			usuarios = (Hashtable<String, String>) contexto.getAttribute("tabla");

			for (Map.Entry<String, String> entrada : usuarios.entrySet()) {

				if (entrada.getKey().equalsIgnoreCase(user) && entrada.getValue().equalsIgnoreCase(pass)) {
					despachador = request.getRequestDispatcher("tienda.jsp");

					despachador.forward(request, response);
					userOK = true;
				} else if (!userOK) {

					despachador = request.getRequestDispatcher("validacion.jsp");

					despachador.forward(request, response);
				}
			}


		} else {
			despachador = request.getRequestDispatcher("validacion.jsp");
			despachador.forward(request, response);
		}
		// 3º comprobamos que los paramaetros coinciden con una entrada de la
		// tabla

		// boolean hayTabla=false;
		// usuarios=(Hashtable<String, String>) contexto.getAttribute("tabla");

		// hayTabla=true;

	}

}
