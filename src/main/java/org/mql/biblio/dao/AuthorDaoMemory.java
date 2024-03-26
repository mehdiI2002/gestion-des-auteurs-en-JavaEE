package org.mql.biblio.dao;

import java.util.List;
import java.util.Vector;

import org.mql.biblio.models.Author;

public class AuthorDaoMemory  implements AuthorDao{
private List<Author> authors;


	public AuthorDaoMemory() {
	
	this.authors = new Vector<Author>();
	authors.add(new Author(101, "James Gosling", 1955));
	authors.add(new Author(102, "Erich Gamma", 1961));
	authors.add(new Author(103, "Tim -Berners-Lee", 1955));
}

	@Override
	public boolean insert(Author a) {
		
		return authors.add(a);
	}

	@Override
	public boolean update(Author a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Author delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author select(int id) { 
		Author resultAuthor = null;
		for (Author a: authors){
			if(a.getId() == id) {
			resultAuthor = a ;
			}
		}
		return resultAuthor;
	}

	@Override
	public List<Author> select() {
		return authors;
	}

	@Override
	public List<Author> insertAuthorDao(Author a) {
		authors.add(a);
		return authors;
		
	}
	

}
