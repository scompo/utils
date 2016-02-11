package com.github.scompo.utils.startable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.github.scompo.utils.startable.commons.TestStartable;

public class StartablesHelperTest {

	@Test
	public void runStartablesTest() {

		List<TestStartable> list = Arrays.asList(new TestStartable());

		StartablesHelper.runStartables(list);

		for (TestStartable testStartable : list) {

			assertTrue(testStartable.isStarted());
		}
	}

	@Test
	public void testConstructorIsPrivate() throws Exception {

		Constructor<StartablesHelper> constructor = StartablesHelper.class.getDeclaredConstructor();
		assertTrue(Modifier.isPrivate(constructor.getModifiers()));
		constructor.setAccessible(true);
		assertEquals(StartablesHelper.class, constructor.newInstance().getClass());
	}

}
