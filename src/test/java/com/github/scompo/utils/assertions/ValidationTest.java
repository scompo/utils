package com.github.scompo.utils.assertions;

import static com.github.scompo.utils.assertions.Validation.validateNotNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ValidationTest {

	private static final String EXPECTED_MESSAGE = "obj is null!";

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testValidateNotNullWithNull() throws Exception {

		Object obj = null;

		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(EXPECTED_MESSAGE);

		validateNotNull(obj, EXPECTED_MESSAGE);

		assertNull(obj);
	}

	@Test
	public void testValidateNotNullWithObj() throws Exception {

		Object obj = new Object();

		validateNotNull(obj, EXPECTED_MESSAGE);

		assertNotNull(obj);
	}

}
