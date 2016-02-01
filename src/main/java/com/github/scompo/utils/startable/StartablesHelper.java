package com.github.scompo.utils.startable;

import java.util.Collection;

/**
 * Helper methods for {@link Startable}.
 */
public abstract class StartablesHelper {

	private StartablesHelper() {

	}

	public static void runStartables(Collection<? extends Startable> sources) {

		sources.forEach(x -> x.doStart());
	}
	
}
