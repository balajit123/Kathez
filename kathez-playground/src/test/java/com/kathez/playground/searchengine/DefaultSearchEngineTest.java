package com.kathez.playground.searchengine;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Balaji
 * 
 */
public class DefaultSearchEngineTest {

	private SearchEngine searchEngine;

	@Before
	public void before() {
		searchEngine = BuildDirector.buildSearchEngine(new DefaultSearchEngineBuilder());
	}

	@Test
	public void shouldReturnResult() {
		SearchCriteria criteria = new NameCriteria("Franklin");
		Collection<Searcheable> result = searchEngine.search(criteria);
		assertNotNull(result);
		for (Searcheable item : result) {
			assertTrue(item instanceof Person);
		}
	}

	@Test(expected = NoResultException.class)
	public void shouldThrowNoResultException() {
		SearchCriteria criteria = new NameCriteria("Invalid Name");
		searchEngine.search(criteria);
	}
	
	@Test
	public void searchAllShouldReturnResult(){
		Collection<Searcheable> result = searchEngine.searchAll();
		assertNotNull(result);
	}
	
	@Test
	public void searchSingleResultShouldReturnList(){
		Searcheable result = searchEngine.searchSingleResult(new NameCriteria("Balaji"));
		assertNotNull(result);
	}
}
