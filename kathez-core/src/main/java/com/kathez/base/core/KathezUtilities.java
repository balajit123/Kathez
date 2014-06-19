package com.kathez.base.core;

import java.util.Collection;

/**
 * A set of general purpose utility methods used throughout the Kathez
 * application
 * 
 * @author Balaji
 * 
 */
public interface KathezUtilities extends KathezBase {

	/**
	 * Throws RuntimeException if the object passed is null
	 * 
	 * @param object
	 * @throws RuntimeException
	 */
	void throwIfNull(Object object) throws RuntimeException;

	/**
	 * Throws RuntimeException if the String passed is null or empty
	 * 
	 * @param string
	 * @throws RuntimeException
	 */
	void throwIfEmpty(String string) throws RuntimeException;

	/**
	 * Returns true if Object passed is null
	 * 
	 * @param object
	 * @return true if object is null
	 */
	boolean isNull(Object object);

	/**
	 * Returns true if object passed is not null
	 * 
	 * @param object
	 * @return true if object is not null
	 */
	boolean isNotNull(Object object);

	/**
	 * Returns true if string passed is null or empty
	 * 
	 * @param string
	 * @return true if string is null or empty
	 */
	boolean isNullOrEmpty(String string);

	/**
	 * Returns true if string passed is not null or not empty
	 * 
	 * @param string
	 * @return true if string is not null or not empty
	 */
	boolean isNotNullOrEmpty(String string);

	/**
	 * Returns true if collection passed is null or empty
	 * 
	 * @param collection
	 * @return true if collection is null or empty
	 */
	boolean isNullOrEmpty(Collection<?> collection);

	/**
	 * Returns true if collection passed is not null or not empty
	 * 
	 * @param collection
	 * @return
	 */
	boolean isNotNullOrEmpty(Collection<?> collection);
}