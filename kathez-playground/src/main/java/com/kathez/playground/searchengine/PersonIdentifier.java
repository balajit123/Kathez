/**
 * 
 */
package com.kathez.playground.searchengine;

/**
 * @author Balaji
 *
 */
public class PersonIdentifier implements Identifier{

	private static final long serialVersionUID = 4824190146029722484L;

	private String emailId;

	public PersonIdentifier(String emailId) {
		super();
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}
}
