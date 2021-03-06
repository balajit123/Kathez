package com.kathez.playground.searchengine;

import java.util.Collection;

/**
 * A dummy implementation of the search engine
 * 
 * @author Balaji
 *
 */
public class DefaultSearchEngine extends AbstractSingleRepoSearchEngine {

	private DefaultRepository repository;

	public DefaultSearchEngine(DefaultRepository repo) {
		super(repo);
		this.repository = repo;
	}
	
	public DefaultSearchEngine() {
		this(new DefaultRepository());
	}	

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.SearchEngine#search(com.kathez.playground.searchengine.SearchCriteria)
	 */
	public Collection<Searcheable> search(SearchCriteria criteria)
			throws NoResultException, NoRepositoryException {
		if(!isRepositoryConfigured()){
			throw new NoRepositoryException();
		}
		
		Collection<Searcheable> result = search(criteria,getRepository());
		if(result == null || result.isEmpty()){
			throw new NoResultException();
		}
		return result;
	}

	private Collection<Searcheable> search(SearchCriteria criteria,
			DefaultRepository repository) {
		return repository.findRecords(criteria);
	}

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.SearchEngine#searchAll()
	 */
	public Collection<Searcheable> searchAll() throws NoResultException,
			NoRepositoryException {
		return repository.getAllRecords();
	}

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.SearchEngine#searchSingleResult(com.kathez.playground.searchengine.SearchCriteria)
	 */
	public Searcheable searchSingleResult(SearchCriteria criteria)
			throws NoResultException, NoRepositoryException {
		return repository.findSingleRecord(criteria);
	}

	@Override
	protected DefaultRepository getRepository() {
		return this.repository;
	}

	public void setRepository(DefaultRepository repository) {
		this.repository = repository;
	}

}
