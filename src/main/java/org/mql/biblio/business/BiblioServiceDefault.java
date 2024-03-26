package org.mql.biblio.business;

import java.util.List;

import org.mql.biblio.dao.AuthorDao;
import org.mql.biblio.models.Author;

//bussniss classe  => facade metier üaddocier au module et pas au modele
public class BiblioServiceDefault implements BiblioService {
	//Dependency inversion,couplage faible  , design pattern bridge
	// ===> necessiter une injection de dependence 
	//===> CDIcontexte dependencies injection (un exemple d 'API fournissant l injection de dependance  authomatiqument par annotaion)

	private AuthorDao authorDao;
	public BiblioServiceDefault() {
		super();
	}

	public BiblioServiceDefault(AuthorDao authorDao) {
		super();
		this.authorDao = authorDao;
	}


	public AuthorDao getAuthorDao() {
		return authorDao;
	}

	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	public boolean addAuthor(Author a) {
		return authorDao.insert(a);
	}

	@Override
	public List<Author> authors() {
		return authorDao.select();
	}

	@Override
	public Author author(int id) {
		return authorDao.select(id);
	}

	@Override
	public List<Author> insertAuthor(Author a) {
		// TODO Auto-generated method stub
		return  authorDao.insertAuthorDao(a);
	}




}
