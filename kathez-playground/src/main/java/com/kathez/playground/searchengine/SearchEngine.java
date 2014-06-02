package com.kathez.playground.searchengine;

import java.util.Collection;

/**
 * @author Balaji
 *
 */
public interface SearchEngine {

	Collection<Searcheable> search(SearchCriteria criteria) throws NoResultException, NoRepositoryException;
	
	Collection<Searcheable> searchAll() throws NoResultException, NoRepositoryException;
	
	Searcheable searchSingleResult(SearchCriteria criteria) throws NoResultException, NoRepositoryException;
	
	boolean isRepositoryConfigured();
}
