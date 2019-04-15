package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		//on récupère la valeur d'un paramètre dont le nom est avecPhoto
		String avecPhotoParam = req.getParameter("avecPhoto"); 
		String departementParam = req.getParameter("departement"); 
		
		
		
		
		resp.setContentType("text/html");
		
		resp.getWriter().write("<h1>Listes des collaborateurs</h1>" 
				+ "<ul>"
				+"<li>avecPhoto="+avecPhotoParam+"</li>"
				+"<li>departement="+departementParam+"</li>"
				+"</ul>");
	}
	

}
 