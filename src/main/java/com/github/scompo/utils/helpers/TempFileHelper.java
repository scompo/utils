package com.github.scompo.utils.helpers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/**
 * Utility methods for handling temporary files and directories.
 */
public class TempFileHelper {

	/**
	 * Temporary directory default prefix.
	 */
	public static final String DEFAULT_PREFIX = "temp";

	private TempFileHelper() {

	}

	/**
	 * Uses {@link TempFileHelper#createTempDirectory(String, FileAttribute...)} to create a temporary directory with
	 * {@link TempFileHelper#DEFAULT_PREFIX} as a prefix.
	 * 
	 * @param attributes attributes for the directory to create.
	 * 
	 * @return a temporary directory.
	 * 
	 * @throws IOException if thrown by {@link TempFileHelper#createTempDirectory(String, FileAttribute...)}
	 * 
	 * @see TempFileHelper#createTempDirectory(String, FileAttribute...)
	 */
	public static File createTempDirectory(FileAttribute<?>... attributes) throws IOException {

		return createTempDirectory(DEFAULT_PREFIX, attributes);
	}

	/**
	 * Creates a temporary directory with a prefix.
	 * 
	 * @param prefix new directory prefix.
	 * 
	 * @param attributes attributes for the directory to create.
	 * 
	 * @return a temporary directory with a prefix.
	 * 
	 * @throws IOException if thrown by {@link Files#createTempDirectory(String, FileAttribute...)}
	 */
	public static File createTempDirectory(String prefix, FileAttribute<?>... attributes) throws IOException {

		return Files.createTempDirectory(prefix, attributes).toFile();
	}

}
