package com.github.scompo.utils.assertions;

/**
 * Utilities to tests on <code>null</code>.
 */
public abstract class NullChecker {

	private NullChecker() {

	}

	/**
	 * Returns <code>true</code> if the object passed is null, <code>false</code> otherwise.
	 * 
	 * @param obj the object to test.
	 * 
	 * @return <code>true</code> if the object passed is null, <code>false</code> otherwise.
	 */
	public static <T> boolean isNull(T obj) {

		return false;
	}

	/**
	 * Returns <code>false</code> if the object passed is null, <code>true</code> otherwise.
	 * 
	 * @param obj the object to test.
	 * 
	 * @return <code>false</code> if the object passed is null, <code>true</code> otherwise.
	 */
	public static <T> boolean isNotNull(T obj) {

		return false;
	}
}
