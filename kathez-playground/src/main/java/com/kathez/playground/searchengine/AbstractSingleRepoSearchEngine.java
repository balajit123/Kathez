package com.kathez.playground.searchengine;


/**
 * @author Balaji
 *
 */
public abstract class AbstractSingleRepoSearchEngine implements SearchEngine{

	public AbstractSingleRepoSearchEngine(Object repo) {
		super();
	}

	public final boolean isRepositoryConfigured() {
		return getRepository() != null;
	}

	protected abstract Object getRepository();
	
}
