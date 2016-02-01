package com.github.scompo.utils.patterns.observer;

import static org.junit.Assert.assertEquals;
import static com.github.scompo.utils.patterns.observer.common.Constants.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.scompo.utils.patterns.observer.common.TestObserver;

public class AbstractObservableAddObserverTest {

	private AbstractObservable<String> observable;

	@Before
	public void setUp() throws Exception {

		observable = new AbstractObservable<>();
	}

	@After
	public void tearDown() throws Exception {

		observable = null;
	}

	@Test
	public void testAddObserver() {

		for (int i = 0; i < NUM_OBSERVERS_TO_CREATE; i++) {

			observable.addObserver(new TestObserver(observable));
		}

		assertEquals(NUM_OBSERVERS_TO_CREATE, observable.getObservers().size());
	}

}
