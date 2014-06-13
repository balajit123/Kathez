/**
 * 
 */
package com.kathez.playground.searchengine;

/**
 * @author Balaji
 *
 */
public class NoResultException extends RuntimeException {

	private static final long serialVersionUID = 5977112307501459362L;
	private String message = "No result found for the given search criteria";
	
	public NoResultException() {
		super();
	}
	public NoResultException(String arg0) {
		super(arg0);
		this.message = arg0;
	}
	@Override
	public String getMessage() {
		super.getMessage();
		return this.message;
	}
	
}
