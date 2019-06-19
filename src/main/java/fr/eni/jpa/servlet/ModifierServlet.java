package fr.eni.jpa.servlet.vin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.jpa.bean.Acteur;
import fr.eni.jpa.bean.Bouteille;
import fr.eni.jpa.bean.Region;
import fr.eni.jpa.bean.Couleur;
import fr.eni.jpa.bean.Style;
import fr.eni.jpa.service.GestionBouteille;
import fr.eni.jpa.service.GestionStyle;

/**
 * Servlet implementation class SupprimerServlet
 */
@WebServlet("/editer")
public class ModifierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
	
			GestionBouteille gb = new GestionBouteille();
			Bouteille b = gb.trouverBouteille(Integer.parseInt(request.getParameter("index").substring(1)));
			request.setAttribute("vin", v);
			RequestDispatcher rd = request.getRequestDispatcher("/editerVin.jsp");
			rd.forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("lister");
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			GestionBouteille gb = new GestionBouteille();
			int index = Integer.parseInt(request.getParameter("id"));
			Bouteille b = gb.trouverBouteille(index);
			b.setNom(request.getParameter("nom"));
			b.setMillesime(request.getParameter("millesime"));
			b.setPetillant(Boolean.parseBoolean(request.getParameter("petillant")));
			
			
			
			b.setNom(request.getParameter("couleur.nom"));
			b.setNom(request.getParameter("region.nom"));
			
			
			
			
			gb.modifierBouteille(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.sendRedirect("lister");
	}
	
	
	

}
