package com.github.scompo.utils.helpers;

import static com.github.scompo.utils.helpers.TempFileHelper.DEFAULT_PREFIX;
import static com.github.scompo.utils.helpers.TempFileHelper.DEFAULT_SUFFIX;
import static com.github.scompo.utils.helpers.TempFileHelper.createTempDirectory;
import static com.github.scompo.utils.helpers.TempFileHelper.createTempFile;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TempFileHelperTest {

	private static final String TEST_SUFFIX = "suffix";
	private static final String TEST_PREFIX = "prefix";

	@Test
	public void testCreateTempDirectoryNoPrefix() throws IOException {

		File tempDirectory = createTempDirectory();

		assertNotNull(tempDirectory);

		assertTrue(tempDirectory.exists());
		assertTrue(tempDirectory.isDirectory());
		assertTrue(tempDirectory.getName().contains(DEFAULT_PREFIX));
	}

	@Test
	public void testCreateTempDirectoryWithPrefix() throws IOException {

		File tempDirectory = createTempDirectory(TEST_PREFIX);

		assertNotNull(tempDirectory);

		assertTrue(tempDirectory.exists());
		assertTrue(tempDirectory.isDirectory());
		assertTrue(tempDirectory.getName().contains(TEST_PREFIX));
	}

	@Test
	public void testCreateTempFileNoPrefixAndSuffix() throws IOException {

		File tempFile = createTempFile();

		assertNotNull(tempFile);

		assertTrue(tempFile.exists());
		assertTrue(tempFile.isFile());
		assertTrue(tempFile.getName().contains(DEFAULT_PREFIX));
		assertTrue(tempFile.getName().contains(DEFAULT_SUFFIX));
	}

	@Test
	public void testCreateTempFileWithPrefix() throws IOException {

		File tempFile = createTempFile(TEST_PREFIX, TEST_SUFFIX);

		assertNotNull(tempFile);

		assertTrue(tempFile.exists());
		assertTrue(tempFile.isFile());
		assertTrue(tempFile.getName().contains(TEST_PREFIX));
		assertTrue(tempFile.getName().contains(TEST_SUFFIX));
	}

}
