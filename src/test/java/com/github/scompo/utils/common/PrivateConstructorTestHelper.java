package com.github.scompo.utils.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class PrivateConstructorTestHelper {

	private PrivateConstructorTestHelper() {

	}

	public static <T> void testUtilClassPrivateConstructor(Class<T> clazz) throws Exception {

		Constructor<T> constructor = clazz.getDeclaredConstructor();
		assertTrue("Constructor is public", Modifier.isPrivate(constructor.getModifiers()));

		constructor.setAccessible(true);
		assertEquals(clazz, constructor.newInstance().getClass());
		constructor.setAccessible(false);
	}
}
