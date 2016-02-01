package com.github.scompo.utils.startable.commons;

import com.github.scompo.utils.startable.Startable;

public class TestStartable implements Startable {
	
	private boolean started = false;

	@Override
	public void doStart() {
		setStarted(true);
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}
}