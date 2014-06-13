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

	private DefaultSearchEngine defaultSearchEngine;

	@Before
	public void before() {
		defaultSearchEngine = new DefaultSearchEngine();
	}

	@Test
	public void shouldReturnResult() {
		SearchCriteria criteria = new NameCriteria("Franklin");
		Collection<Searcheable> result = defaultSearchEngine.search(criteria);
		assertNotNull(result);
		for (Searcheable item : result) {
			assertTrue(item instanceof Person);
		}
	}

	@Test(expected = NoResultException.class)
	public void shouldThrowNoResultException() {
		SearchCriteria criteria = new NameCriteria("Invalid Name");
		defaultSearchEngine.search(criteria);
	}

}
