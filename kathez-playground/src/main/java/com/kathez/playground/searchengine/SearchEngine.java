package com.kathez.playground.searchengine;

import java.util.Collection;

/**
 * @author Balaji
 *
 */
public interface SearchEngine {

	Collection<Searcheable> search(SearchCriteria criteria) throws NoResultException;
	
	Collection<Searcheable> searchAll() throws NoResultException;
	
	Searcheable searchSingleResult(SearchCriteria criteria) throws NoResultException;
	
	boolean isRepoConfigured();
}
