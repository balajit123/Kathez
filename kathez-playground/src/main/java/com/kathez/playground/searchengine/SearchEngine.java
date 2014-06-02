/**
 * 
 */
package com.kathez.playground.searchengine;

import java.util.List;

/**
 * @author Balaji
 *
 */
public interface SearchEngine {

	Searcheable search(SearchCriteria criteria);
	
	List<Searcheable> searchAll();
	
	List<Searcheable> searchMany(SearchCriteria criteria);
}
