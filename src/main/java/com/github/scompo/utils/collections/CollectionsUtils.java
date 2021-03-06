package com.github.scompo.utils.collections;

import java.util.Collection;

/**
 * Utilities for {@link Collection}s handling.
 */
public class CollectionsUtils {

	private CollectionsUtils() {

	}

	/**
	 * Returns the only element of a {@link Collection}.
	 * 
	 * @param collection the {@link Collection} to get the only element from.
	 * @param <T> the type of the {@link Collection}.
	 * 
	 * @return the only element of a {@link Collection}
	 */
	public static <T> T getOnlyElement(Collection<T> collection) {

		checkElementSize(collection, 1);

		return collection.iterator().next();
	}

	/**
	 * Helper method to check elements size of a {@link Collection}.
	 * 
	 * @param collection the {@link Collection} to check for size.
	 * @param <T> the type of the {@link Collection}.
	 * 
	 * @param numberOfElements the expected number of elements.
	 */
	private static <T> void checkElementSize(Collection<T> collection, int numberOfElements) {

		int size = collection.size();

		if (size != numberOfElements) {

			throw new IllegalArgumentException(String.format("Expected %d element, found: %d", numberOfElements, size));
		}
	}

}
