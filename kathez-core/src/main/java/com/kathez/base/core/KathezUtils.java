package com.kathez.base.core;

import java.util.Collection;

/**
 * Default Singleton implementation of the KathezUtilities interface
 * 
 * @author Balaji
 *
 */
public class KathezUtils implements KathezUtilities {

	private static KathezUtils instance = null;
	
	private KathezUtils() {
		super();
	}
	
	public static synchronized KathezUtils getInstance(){
		if(instance == null){
			instance = new KathezUtils();
		}
		return instance;
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#throwIfNull(java.lang.Object)
	 */
	public void throwIfNull(Object object) throws RuntimeException {

		if(object == null){
			throw new RuntimeException("The argument should not be null");
		}
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#throwIfEmpty(java.lang.String)
	 */
	public void throwIfEmpty(String string) throws RuntimeException {

		if(string == null || string.trim().equals("")){
			throw new RuntimeException("The argument should not be null or empty");
		}
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNull(java.lang.Object)
	 */
	public boolean isNull(Object object) {
		
		if(object == null){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNotNull(java.lang.Object)
	 */
	public boolean isNotNull(Object object) {
		
		return !isNull(object);
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNullOrEmpty(java.lang.String)
	 */
	public boolean isNullOrEmpty(String string) {
		
		if(string == null || string.trim().equals("")){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNotNullOrEmpty(java.lang.String)
	 */
	public boolean isNotNullOrEmpty(String string) {
		
		return !isNullOrEmpty(string);
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNullOrEmpty(java.util.Collection)
	 */
	public boolean isNullOrEmpty(Collection<?> collection) {
		
		if(collection == null || collection.isEmpty()){
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.kathez.base.core.KathezUtilities#isNotNullOrEmpty(java.util.Collection)
	 */
	public boolean isNotNullOrEmpty(Collection<?> collection) {
		
		return !isNullOrEmpty(collection);
	}

}
