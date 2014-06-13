/**
 * 
 */
package com.kathez.playground.searchengine;

/**
 * @author Balaji
 *
 */
public class Person implements Searcheable {

	private static final long serialVersionUID = -1927297727008799066L;
	private PersonIdentifier identifier;
	
	private String name;

	public Person() {
		super();
	}

	public Person(PersonIdentifier identifier) {
		super();
		this.identifier = identifier;
	}

	public Person(PersonIdentifier identifier, String name) {
		super();
		this.identifier = identifier;
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.Searcheable#getIdentifier()
	 */
	public Identifier getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(PersonIdentifier identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
