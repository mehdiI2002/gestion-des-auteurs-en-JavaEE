package org.mql.biblio.web.actions;

import java.util.Hashtable;

public class Model {
	private Hashtable<String, Object> attributes;

	public Model() {
		attributes = new Hashtable<String, Object>();
	}
	public Model(String name , Object model) {
		attributes = new Hashtable<String, Object>();
		attributes.put(name, model);
	}
public void add(String name,Object model) {
	attributes.put(name, model);
}
public Object get(String name ) {
	return attributes.get(name);
}
}
