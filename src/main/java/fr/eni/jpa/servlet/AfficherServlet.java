package fr.eni.jpa.servlet.vin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.jpa.bean.Bouteille;
import fr.eni.jpa.bean.Region;
import fr.eni.jpa.service.GestionBouteille;

/**
 * Servlet implementation class ListeFilmsServlet
 */
@WebServlet("/afficher")
public class AfficherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean ok = false;
		try {
			int id = Integer.parseInt(request.getParameter("index"));
			GestionBouteille gb = new GestionBouteille();
			Bouteille b = gb.trouverBouteille(id);
			if (b != null){
				ok = true;
				request.setAttribute("bouteille", b);
			}
		} catch (Exception e) {
		}

		if (ok){
			RequestDispatcher rd = request.getRequestDispatcher("afficherVin.jsp");
			rd.forward(request, response);
		}
		else{
			response.sendRedirect("lister");
		}
	}

}
