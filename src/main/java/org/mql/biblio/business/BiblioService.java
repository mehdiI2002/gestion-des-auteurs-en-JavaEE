package org.mql.biblio.business;

import java.util.List;

import org.mql.biblio.models.Author;

public interface BiblioService  {
public boolean addAuthor(Author a);
public List<Author> authors();
public Author author(int id);
public List<Author> insertAuthor(Author a);
}
