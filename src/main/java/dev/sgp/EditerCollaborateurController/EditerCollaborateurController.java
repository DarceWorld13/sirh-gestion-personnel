package dev.sgp.EditerCollaborateurController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditerCollaborateurController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String matricule = request.getParameter("matricule");

		try (PrintWriter out = response.getWriter()) {
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<head>");
			out.print("<title>Login</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("<h1> Veuillez désigner le numéro de matricule <h1><br>");
			out.print("<form method ='post' action='editer?M01'>");
			out.print("<label>matricule</label>");
			out.print("<input name = 'matricule' type = 'text' autofocus><br>");
			out.print("<label>titre</label>");
			out.print("<input name = 'titre' type = 'text'><br>");
			out.print("<label>nom</label>");
			out.print("<input name = 'nom' type = 'text'><br>");
			out.print("<label>prenom</label>");
			out.print("<input name = 'prenom' type = 'text'><br>");
			out.print("<input  type = 'submit' value = 'envoyer'><br>");
			out.print("</form>");
			out.print("</body>");
			out.print("</html>");

		}

		/*if (matricule != null && !(matricule.isEmpty())) {

			response.setContentType("text/html");
			response.getWriter().write("<p>Matricule : M01</p>");

		} else {

			response.setContentType("text/html");
			response.sendError(400, "un matricule est attendu");

		}*/

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//récupération du paramètre, provenant du formulaire
		String matricule = request.getParameter("matricule");
		String titre = request.getParameter("titre"); 
		String nom = request.getParameter("nom"); 
		String prenom = request.getParameter("prenom"); 
		
		//verificiation que les paramètres ne sont pas vides
		
		if(matricule.isEmpty() || titre.isEmpty() || nom.isEmpty() || prenom.isEmpty() ) {
			//lorsqu'ils sont vides, on envoit un message d'erreurs suivi du messages
			
			response.sendError(400, "les paramètres suivant sont incorrects");
		}else {
			
			//dans le cas où ils sont correctement rempli, on affiche une page qui contiendra son ajout
			response.setStatus(201);
			response.getWriter().write("<p>Matricule : "+matricule+ ", titre : " +titre +" nom : "+nom + ", prenom : "+prenom+"</p>");
		}
		
	

	}

}
