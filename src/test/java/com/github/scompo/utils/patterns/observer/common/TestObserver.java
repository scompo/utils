package com.github.scompo.utils.patterns.observer.common;

import static org.junit.Assert.assertEquals;

import com.github.scompo.utils.patterns.observer.Observable;
import com.github.scompo.utils.patterns.observer.Observer;

public class TestObserver implements Observer<String>{

	private String data = Constants.OLD_DATA;

	private Observable<String> observable;

	public TestObserver(Observable<String> observable) {

		this.observable = observable;
	}

	@Override
	public void updateObserver(Observable<String> observable, String param) {

		assertEquals(this.observable, observable);

		setData(param);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
