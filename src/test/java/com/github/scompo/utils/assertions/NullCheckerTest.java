package com.github.scompo.utils.assertions;

import static com.github.scompo.utils.assertions.NullChecker.isNotNull;
import static com.github.scompo.utils.assertions.NullChecker.isNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NullCheckerTest {

	private static final Object NULL_OBJ = null;

	private static final Object NOT_NULL_OBJ = new Object();

	@Test
	public void testIsNull() {

		assertTrue(isNull(NULL_OBJ));
		assertFalse(isNull(NOT_NULL_OBJ));
	}

	@Test
	public void testIsNotNull() {

		assertFalse(isNotNull(NULL_OBJ));
		assertTrue(isNotNull(NOT_NULL_OBJ));
	}

}
