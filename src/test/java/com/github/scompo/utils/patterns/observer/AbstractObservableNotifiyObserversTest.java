package com.github.scompo.utils.patterns.observer;

import static com.github.scompo.utils.patterns.observer.common.Constants.CHANGED_DATA;
import static com.github.scompo.utils.patterns.observer.common.Constants.NUM_OBSERVERS_TO_CREATE;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.github.scompo.utils.patterns.observer.common.TestObserver;

public class AbstractObservableNotifiyObserversTest {

	private AbstractObservable<String> observable;
	
	private Collection<TestObserver> observers;
	
	@Before
	public void setUp() throws Exception {
		
		observable = new AbstractObservable<String>();
		
		observers = new ArrayList<TestObserver>();
		
		for (int i = 0; i < NUM_OBSERVERS_TO_CREATE; i++) {
			
			TestObserver observer = new TestObserver(observable);
			
			observers.add(observer);
			observable.addObserver(observer);
		}
	}

	@After
	public void tearDown() throws Exception {
		
		observable = null;
	}

	@Test
	public void testNotifyObservers() {
		
		observable.notifyObservers(CHANGED_DATA);
		
		for (TestObserver observer : observers) {
			
			assertEquals(CHANGED_DATA, observer.getData());
		}
	}


}
