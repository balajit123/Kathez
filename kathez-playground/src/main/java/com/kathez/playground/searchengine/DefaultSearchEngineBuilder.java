/**
 * 
 */
package com.kathez.playground.searchengine;

/**
 * Builds a default search engine object
 * 
 * @author Balaji
 *
 */
public class DefaultSearchEngineBuilder implements SearchEngineBuilder{

	private DefaultSearchEngine searchEngine;

	public DefaultSearchEngineBuilder() {
		super();
		this.searchEngine = new DefaultSearchEngine();
	}

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.SearchEngineBuilder#buildRepository()
	 */
	public void buildRepository() {
		this.searchEngine.setRepository(new DefaultRepository());
	}

	/* (non-Javadoc)
	 * @see com.kathez.playground.searchengine.SearchEngineBuilder#buildSearchEngine()
	 */
	public SearchEngine buildSearchEngine() {
		return this.searchEngine;
	}
}
