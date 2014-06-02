package com.kathez.playground.searchengine;

import java.util.Collection;

/**
 * @author Balaji
 *
 */
public abstract class AbstractMultiRepoSearchEngine implements SearchEngine{

	public AbstractMultiRepoSearchEngine(Collection<Object> repos) {
		super();
	}

	public final boolean isRepositoryConfigured() {
		return getRepository() != null && !getRepository().isEmpty();
	}

	protected abstract Collection<Object> getRepository();
}
