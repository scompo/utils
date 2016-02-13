package com.github.scompo.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.github.scompo.utils.assertions.NullChecker;
import com.github.scompo.utils.startable.StartablesHelper;

@RunWith(Parameterized.class)
public class PrivateConstructorTest {

	private Class<?> clazz;
	
	@Parameters(name = "{index} : {0} has a private constructor")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { StartablesHelper.class }, { NullChecker.class } });
	}

	public PrivateConstructorTest(Class<?> clazz) {

		this.clazz = clazz;
	}

	@Test
	public void testUtilClassPrivateConstructor() throws Exception {

		Constructor<?> constructor = clazz.getDeclaredConstructor();
		assertTrue("Constructor is public for class:" + clazz, Modifier.isPrivate(constructor.getModifiers()));

		constructor.setAccessible(true);
		assertEquals(clazz, constructor.newInstance().getClass());
		constructor.setAccessible(false);
	}
}
