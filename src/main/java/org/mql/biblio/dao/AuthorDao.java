package org.mql.biblio.dao;

import java.util.List;

import org.mql.biblio.models.Author;

public interface AuthorDao {
public  boolean insert(Author a);
public boolean update(Author a);
public Author delete(int id);
public Author select(int id);
public List<Author> select();
public List<Author> insertAuthorDao(Author a);
}
