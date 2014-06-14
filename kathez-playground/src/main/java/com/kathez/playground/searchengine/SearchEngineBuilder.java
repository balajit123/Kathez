package com.kathez.playground.searchengine;

/**
 * Interface for building a search engine object
 * Based on the Builder design pattern
 *  
 * @author Balaji
 *
 */
public interface SearchEngineBuilder {

	/**
	 * Configure the repository required for the search engine 
	 */
	void buildRepository();
	
	/**
	 * Build and return the full fledged search engine object
	 * @return a complete workable search engine object
	 */
	SearchEngine buildSearchEngine();
}
