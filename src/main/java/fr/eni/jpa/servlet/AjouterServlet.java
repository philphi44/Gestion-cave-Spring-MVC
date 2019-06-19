package fr.eni.jpa.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.eni.jpa.bean.Bouteille;
import fr.eni.jpa.service.GestionBouteille;

/**
 * Servlet implementation class AjouterServlet
 */
@WebServlet("/ajouter")
public class AjouterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("ajouterVin.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			
			Bouteille b = new Bouteille();
			b.setNom(request.getParameter("nom"));
			b.setMillesime(request.getParameter("millesime"));
			b.setPetillant(Boolean.parseBoolean(request.getParameter("petillant")));
			b.setQuantite(Integer.parseInt(request.getParameter("quantite")));
			b.setCouleur(request.getParameter("couleur.nom"));
			b.setRegion(request.getParameter("region.nom"));
			
			
			
			GestionBouteille gb = new GestionBouteille();
			gb.ajoutBouteille(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("lister");
	}

}
