package com.kathez.base.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Test case for KatezUtils class
 * 
 * @author Balaji
 * 
 */
public class KathezUtilsTest {

	private static KathezUtils utils;

	@BeforeClass
	public static void beforeClass() {
		utils = KathezUtils.getInstance();
	}

	@Test(expected = RuntimeException.class)
	public void testThrowIfNullHappyPath() {
		utils.throwIfNull(null);
	}

	@Test
	public void testThrowIfNullUnHappyPath() {
		utils.throwIfNull(1);
		utils.throwIfNull("");
		utils.throwIfNull(new Long(1));
	}

	@Test(expected = RuntimeException.class)
	public void testThrowIfEmptyForNull() {
		utils.throwIfEmpty(null);
	}

	@Test(expected = RuntimeException.class)
	public void testThrowIfEmptyForEmptyString() {
		utils.throwIfEmpty(" ");
	}

	@Test
	public void testThrowIfEmptyForValidString() {
		utils.throwIfEmpty("Good morning");
	}

	@Test
	public void testIsNullForNull() {
		Boolean bool = null;
		assertTrue(utils.isNull(bool));
	}
	
	@Test
	public void testIsNullForNotNull() {
		Double dbl = new Double(23);
		assertFalse(utils.isNull(dbl));
	}

	@Test
	public void testIsNotNullForNotNull() {
		assertTrue(utils.isNotNull(new Integer(1)));
	}
	
	@Test
	public void testIsNotNullForNull() {
		assertFalse(utils.isNotNull(null));
	}

	@Test
	public void testIsNullOrEmptyForNull() {
		String str = null;
		assertTrue(utils.isNullOrEmpty(str));
	}
	
	@Test
	public void testIsNullOrEmptyForEmpty() {
		String str = "   ";
		assertTrue(utils.isNullOrEmpty(str));
	}
	
	@Test
	public void testIsNullOrEmptyForValidString() {
		String str = " Good one  ";
		assertFalse(utils.isNullOrEmpty(str));
	}

	@Test
	public void testIsNotNullOrEmpty() {
		String str = " Nice string  ";
		assertTrue(utils.isNotNullOrEmpty(str));
	}
	
	@Test
	public void testIsNotNullOrEmptyForInvalidString() {
		String str = "  ";
		assertFalse(utils.isNotNullOrEmpty(str));
		str = null;
		assertFalse(utils.isNotNullOrEmpty(str));
	}

	@Test
	public void testIsNullOrEmptyForNullCollection() {
		Collection<?> coll = null;
		assertTrue(utils.isNullOrEmpty(coll));
	}
	
	@Test
	public void testIsNullOrEmptyForEmptyCollection() {
		Collection<?> coll = new ArrayList<String>();
		assertTrue(utils.isNullOrEmpty(coll));
	}
	
	@Test
	public void testIsNullOrEmptyForNotEmptyCollection() {
		Collection<String> coll = new ArrayList<String>();
		coll.add("A string");
		assertFalse(utils.isNullOrEmpty(coll));
	}

	@Test
	public void testIsNotNullOrEmptyForValidCollection() {
		Collection<String> coll = new HashSet<String>();
		coll.add("A string");
		assertTrue(utils.isNotNullOrEmpty(coll));
	}
	
	@Test
	public void testIsNotNullOrEmptyForInValidCollection() {
		Collection<String> coll = null;
		assertFalse(utils.isNotNullOrEmpty(coll));
		
		coll = new HashSet<String>();
		assertFalse(utils.isNotNullOrEmpty(coll));
	}

}
