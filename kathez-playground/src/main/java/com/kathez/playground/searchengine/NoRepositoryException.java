package com.kathez.playground.searchengine;

/**
 * @author Balaji
 *
 */
public class NoRepositoryException extends RuntimeException {

	private static final long serialVersionUID = -4334061296988284850L;
	
	private String message = "No Repository defined for the Search Engine";

	
	public NoRepositoryException() {
		super();
	}


	public NoRepositoryException(String arg0) {
		super(arg0);
		this.message = arg0;
	}


	@Override
	public String getMessage() {
		super.getMessage();
		return this.message;
	}
}
