package com.github.scompo.utils.patterns.observer;

/**
 * Method definitions for an {@link Observer} object.
 * 
 * @author Mauro Scomparin
 *
 * @param <T> the type of parameter passed
 */
public interface Observer<T> {

	/**
	 * Method called by an {@link Observable} to notify the {@link Observer}.
	 * 
	 * @param observable the {@link Observable} who is notifying.
	 * 
	 * @param param the parameter passed by the {@link Observable}.
	 */
	void updateObserver(Observable<T> observable, T param);
}
