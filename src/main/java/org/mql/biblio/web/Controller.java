package org.mql.biblio.web;

import java.io.IOException;

import org.mql.biblio.web.actions.AuthorAction;
import org.mql.biblio.web.actions.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet({"/mql/*","*.mql"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dataSource;
	private String prefix;
	private String suffix;
	private AuthorAction authorAction;
	@Override
	public void init() throws ServletException {

		dataSource = getServletContext().getInitParameter ("data source");
		prefix = getInitParameter("prefix");
		suffix = getInitParameter("suffix");
		authorAction =new AuthorAction();


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//new ObjectOutputStream(response.getOutputStream()).writeObject(object);

		//PrintWriter out = response.getWriter();
		//out.println("<h1> Test d une servelet"+request.getRequestURI()+" </h1>");
		Model model = new Model("message","Service introuvable");
		String view = "error";
		String uri = request.getRequestURI();
		if(uri.endsWith("/get-all-authors")) {
			

			view =authorAction.getAllAuthors();
			model = authorAction.getModel();
		}
		else  if(uri.endsWith("/get-author")) {
			view = authorAction.getAuthor();
			model= authorAction.getModel();

		}
		else if(uri.endsWith("/saisie-id")) {
			
			view = authorAction.saisieId();
			
			model = authorAction.getModel();
		}
		
		request.setAttribute("model",model);
		request.getRequestDispatcher(prefix+view+suffix).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Model model = new Model("message","Service introuvable");
		String view = "error";
		String uri = request.getRequestURI();
		if(uri.endsWith("/add-author")) {
			String idString = request.getParameter("id");
			String nom = request.getParameter("nom");
			String yearBornString = request.getParameter("yearBorn");
			int id = Integer.parseInt(idString);
			int yearBorn = Integer.parseInt(yearBornString);
			view = authorAction.addAuthor(id, nom, yearBorn);
			model = authorAction.getModel();


		}
		request.setAttribute("model",model);
		request.getRequestDispatcher(prefix+view+suffix).forward(request, response);

	}

}

