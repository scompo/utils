package com.github.scompo.utils.assertions;

/**
 * Utilities for parameters validation.
 */
public class Validation {

	private Validation() {

	}

	/**
	 * Throws an {@link IllegalArgumentException} with the supplied message if the object to valdate is
	 * <code>null</code>.
	 * 
	 * @param obj the object to validate.
	 * @param <T> the class of the supplied object, implicit.
	 * @param message the message for the {@link IllegalArgumentException} to throw.
	 * @throws IllegalArgumentException with the supplied message if the object to valdate is <code>null</code>.
	 */
	public static <T> void validateNotNull(T obj, String message) throws IllegalArgumentException {

		if (obj == null) {

			throw new IllegalArgumentException(message);
		}
	}
}
