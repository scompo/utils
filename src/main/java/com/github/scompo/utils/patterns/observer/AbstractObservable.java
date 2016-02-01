package com.github.scompo.utils.patterns.observer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * {@link Observable} base implementation.
 * 
 * @author Mauro Scomparin
 *
 * @param <T> the type of the {@link Observable}
 */
public class AbstractObservable<T> implements Observable<T> {

	private Collection<Observer<T>> observers;

	public AbstractObservable() {

		observers = initializeObservers();
	}

	@Override
	public void addObserver(Observer<T> observer) {

		synchronized (observers) {

			observers.add(observer);

		}
	}

	@Override
	public void notifyObservers(T param) {

		synchronized (observers) {
			
			for (Observer<T> myObserver : observers) {
				
				myObserver.updateObserver(this, param);
			}
		}
	}

	/**
	 * Override this method to change the default {@link Collection} of {@link Observer} implementation.
	 * 
	 * @return an initialized {@link Collection} of {@link Observer}
	 */
	protected Collection<Observer<T>> initializeObservers() {

		return new ArrayList<Observer<T>>();
	}

	@Override
	public String toString() {
		return "AbstractObservable [observers=" + observers + "]";
	}

	public Collection<Observer<T>> getObservers() {
		return observers;
	}
}
