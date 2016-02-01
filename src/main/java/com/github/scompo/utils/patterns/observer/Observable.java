package com.github.scompo.utils.patterns.observer;

/**
 * Method definitions for an {@link Observable} object.
 * 
 * @author Mauro Scomparin
 *
 * @param <T> the type of parameters to pass to the {@link Observer}.
 * 
 * @see Observer
 */
public interface Observable<T> {

	/**
	 * Adds an {@link Observer} to this {@link Observable}.
	 * 
	 * @param eventObserver the {@link Observer} to add.
	 */
	void addObserver(Observer<T> eventObserver);
	
	/**
	 * Notifies all associated {@link Observer}s.
	 * 
	 * @param param the parameter to pass to the observers.
	 */
	void notifyObservers(T param);
}
