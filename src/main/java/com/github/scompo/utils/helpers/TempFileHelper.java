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
	 * Temporary file default prefix.
	 */
	public static final String DEFAULT_PREFIX = "temp";

	/**
	 * Temporary file default suffix
	 */
	public static final String DEFAULT_SUFFIX = ".temp";

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
	 * Uses {@link Files#createTempDirectory(String, FileAttribute...)} to create a temporary directory with a prefix.
	 * 
	 * @param prefix new directory prefix.
	 * 
	 * @param attributes attributes for the directory to create.
	 * 
	 * @return a temporary directory with a prefix.
	 * 
	 * @throws IOException if thrown by {@link Files#createTempDirectory(String, FileAttribute...)}
	 * 
	 * @see Files#createTempDirectory(String, FileAttribute...)
	 */
	public static File createTempDirectory(String prefix, FileAttribute<?>... attributes) throws IOException {

		return Files.createTempDirectory(prefix, attributes).toFile();
	}

	/**
	 * Uses {@link Files#createTempFile(String, String, FileAttribute...)} to create a temporary file with a prefix,
	 * suffix and attributes.
	 * 
	 * @param prefix temporary file prefix.
	 * 
	 * @param suffix temporary file suffix.
	 * 
	 * @param attrs temporary file attributes.
	 * 
	 * @return a temporary file with a prefix, suffix and attributes.
	 * 
	 * @throws IOException if thrown by {@link Files#createTempFile(String, String, FileAttribute...)}
	 * 
	 * @see Files#createTempFile(String, String, FileAttribute...)
	 */
	public static File createTempFile(String prefix, String suffix, FileAttribute<?>... attrs) throws IOException {

		return Files.createTempFile(prefix, suffix, attrs).toFile();
	}

	/**
	 * Uses {@link TempFileHelper#createTempFile(String, String, FileAttribute...)} to create a temporary file with
	 * {@link TempFileHelper#DEFAULT_PREFIX} as prefix and {@link TempFileHelper#DEFAULT_SUFFIX} as suffix.
	 * 
	 * @param attrs temporary file attributes.
	 * 
	 * @return a temporary file with {@link TempFileHelper#DEFAULT_PREFIX} as prefix and
	 * {@link TempFileHelper#DEFAULT_SUFFIX} as suffix.
	 * 
	 * @throws IOException if thrown by {@link TempFileHelper#createTempFile(String, String, FileAttribute...)}.
	 * 
	 * @see TempFileHelper#createTempFile(String, String, FileAttribute...)
	 */
	public static File createTempFile(FileAttribute<?>... attrs) throws IOException {

		return createTempFile(DEFAULT_PREFIX, DEFAULT_SUFFIX, attrs);
	}

}
