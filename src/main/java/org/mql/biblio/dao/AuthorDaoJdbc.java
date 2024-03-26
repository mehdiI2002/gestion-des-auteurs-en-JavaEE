package org.mql.biblio.dao;

import java.util.List;

import org.mql.biblio.models.Author;

public class AuthorDaoJdbc  implements AuthorDao{

	@Override
	public boolean insert(Author a) {
		return false;
	}

	@Override
	public boolean update(Author a) {
		return false;
	}

	@Override
	public Author delete(int id) {
		return null;
	}

	@Override
	public Author select(int id) {
		return null;
	}

	@Override
	public List<Author> select() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	public List<Author> insertAuthorDao(Author a) {
		// TODO Auto-generated method stub
		return null;
	}

}
