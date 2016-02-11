package com.github.scompo.utils.startable;

import java.util.Collection;

/**
 * Helper methods for {@link Startable}.
 */
public class StartablesHelper {

	private StartablesHelper() {

	}

	/**
	 * Starts a {@link Collection} of {@link Startable}s.
	 * 
	 * @param startables the {@link Collection} of {@link Startable}s to start.
	 */
	public static void runStartables(Collection<? extends Startable> startables) {

		startables.forEach(x -> x.doStart());
	}
	
}
