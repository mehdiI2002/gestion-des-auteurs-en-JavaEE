package org.mql.biblio.web.actions;

import org.mql.biblio.business.BiblioService;
import org.mql.biblio.business.BiblioServiceDefault;
import org.mql.biblio.dao.AuthorDao;
import org.mql.biblio.dao.AuthorDaoMemory;

public class ServiceProvider {
private static BiblioService service;
static {
	//wiring 
	AuthorDao authorDao = new AuthorDaoMemory();
	service = new BiblioServiceDefault(authorDao);
	
}
public static BiblioService getService() {
	return service;
}
public static void setService(BiblioService service) {
	ServiceProvider.service = service;
}

}
