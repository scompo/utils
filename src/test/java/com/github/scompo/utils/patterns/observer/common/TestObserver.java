package com.github.scompo.utils.patterns.observer.common;

import static org.junit.Assert.assertEquals;

import com.github.scompo.utils.patterns.observer.Observable;
import com.github.scompo.utils.patterns.observer.Observer;

public class TestObserver implements Observer<String>{

	private String dato = Constants.OLD_DATA;

	private Observable<String> observable;

	public TestObserver(Observable<String> observable) {

		this.observable = observable;
	}

	@Override
	public void updateObserver(Observable<String> observable, String param) {

		assertEquals(this.observable, observable);

		setDato(param);
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

}
