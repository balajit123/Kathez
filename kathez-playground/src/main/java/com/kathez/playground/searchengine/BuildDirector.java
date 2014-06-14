package com.kathez.playground.searchengine;

/**
 * Common build director used for creating various complex objects.
 * Based on the Builder design pattern
 * 
 * @author Balaji
 * 
 */
public class BuildDirector {

	public static SearchEngine buildSearchEngine(
			SearchEngineBuilder searchEngineBuilder) {
		
		searchEngineBuilder.buildRepository();
		return searchEngineBuilder.buildSearchEngine();
	}

}
