/**
 * 
 */
package com.kathez.playground.searchengine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Balaji
 *
 */
public class DefaultRepository {

	private static class RecordSet {
		
		Collection<Searcheable> records = null;
		
		public RecordSet() {
			super();
			records = new ArrayList<Searcheable>();
			records.add(new Person(new PersonIdentifier("emailId1"),"Balaji"));
			records.add(new Person(new PersonIdentifier("emailId2"),"Franklin"));
			records.add(new Person(new PersonIdentifier("emailId3"),"Paul"));
			records.add(new Person(new PersonIdentifier("emailId4"),"Mark"));
			records.add(new Person(new PersonIdentifier("emailId5"),"Neil"));
		}
	}


	private RecordSet recordSet;

	public DefaultRepository() {
		super();
		this.recordSet = new RecordSet();
	}

	public Collection<Searcheable> findRecords(SearchCriteria criteria) {
		if(criteria instanceof NameCriteria){
			return findNames((NameCriteria)criteria);
		}
		return null;
	}

	private Collection<Searcheable> findNames(NameCriteria criteria) {
		Collection<Searcheable> result = new ArrayList<Searcheable>();
		for(Searcheable searcheable : recordSet.records){
			if(searcheable instanceof Person && ((Person)searcheable).getName().equals(criteria.getNameToFind())){
				result.add(searcheable);
			}
		}
		return result;
	}

	public Collection<Searcheable> getAllRecords() {
		return recordSet.records;
	}

	public Searcheable findSingleRecord(SearchCriteria criteria) {
		if(criteria instanceof NameCriteria){
			return findName((NameCriteria) criteria);
		}
		return null;
	}

	private Searcheable findName(NameCriteria criteria) {
		for(Searcheable searcheable : recordSet.records){
			if(searcheable instanceof Person && ((Person)searcheable).getName().equals(criteria.getNameToFind())){
				return searcheable;
			}
		}
		return null;
	}

}
