package fr.eni.jpa.servlet.vin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.jpa.service.GestionBouteille;

/**
 * Servlet implementation class SupprimerServlet
 */
@WebServlet("/supprimer")
public class SupprimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			GestionBouteille gb = new GestionBouteille();
			gb.supprimerVin(Integer.parseInt(request.getParameter("index").substring(1)));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("lister");
	}

}
