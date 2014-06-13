/**
 * 
 */
package com.kathez.playground.searchengine;

/**
 * @author Balaji
 *
 */
public class NameCriteria implements SearchCriteria {

	private String nameToFind;

	public NameCriteria(String nameToFind) {
		super();
		this.nameToFind = nameToFind;
	}

	public String getNameToFind() {
		return nameToFind;
	}
}
