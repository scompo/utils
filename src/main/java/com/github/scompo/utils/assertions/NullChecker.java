package com.github.scompo.utils.assertions;

/**
 * Utilities to tests on <code>null</code>.
 */
public class NullChecker {

	private NullChecker() {

	}

	/**
	 * Returns <code>true</code> if the object passed is null, <code>false</code> otherwise.
	 * 
	 * @param obj the object to test.
	 * 
	 * @param <T> class of the object to check.
	 * 
	 * @return <code>true</code> if the object passed is null, <code>false</code> otherwise.
	 */
	public static <T> boolean isNull(T obj) {

		return obj == null;
	}

	/**
	 * Uses {@link NullChecker#isNull(Object)} to return <code>false</code> if the object passed is null,
	 * <code>true</code> otherwise.
	 * 
	 * @param obj the object to test.
	 * 
	 * @param <T> class of the object to check.
	 * 
	 * @return <code>false</code> if the object passed is null, <code>true</code> otherwise.
	 * 
	 * @see NullChecker#isNull(Object)
	 */
	public static <T> boolean isNotNull(T obj) {

		return !isNull(obj);
	}
}
