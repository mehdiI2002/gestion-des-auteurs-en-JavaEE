package org.mql.biblio.web.actions;
/*
 * classe d action pour gerer les auteurs 
 * ==> selon  le vocabulaire soring ou spring boot en appelle aussi 
 * un controlleur :AuthotController 
 * 
 */
import java.util.List;
import org.mql.biblio.business.BiblioService;
import org.mql.biblio.models.Author;

public class AuthorAction {
	private BiblioService service;
	private Model model;
	public AuthorAction() {
		service = ServiceProvider.getService();
	}
	public AuthorAction(BiblioService service) {
		super();
		this.service = service;
	}
	//methode d'action :
	public String  getAllAuthors(){
		List<Author> authors = service.authors();
		model = new Model();
		model.add("tittle","Liste de tous les auteurs");
		model.add("authors", authors);
		return "print-authors";//retourner la vue 
	} 
	public String saisieId() {
		model = new Model();
		model.add("tittle","Ajout d 'un auteur");
		return "saisieId";

	}
	public String getAuthor() {
		Author author = service.author(0);
		model = new Model();
		model.add("tittle", "auteur selectionner ");
		model.add("author", author);
		return "get-author";
	}
	public Model  getModel() {
		return model; 
	}
	public String addAuthor(int id,String name,int yearBorn) {
		Author newAuthor = new Author(id,name,yearBorn);
		List<Author> authors = service.insertAuthor(newAuthor);
		model.add("tittle","Liste de tous les auteurs");
		model.add("authors", authors);
		return "print-authors";


	}

}
