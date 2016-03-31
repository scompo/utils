package com.github.scompo.utils.helpers;

import static com.github.scompo.utils.helpers.TempFileHelper.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TempFileHelperTest {

	@Test
	public void testCreateTempDirectoryNoPrefix() throws IOException {

		File tempDirectory = createTempDirectory();

		assertNotNull(tempDirectory);

		assertTrue(tempDirectory.exists());
		assertTrue(tempDirectory.isDirectory());
		assertTrue(tempDirectory.getName().contains(TempFileHelper.DEFAULT_PREFIX));
	}

	@Test
	public void testCreateTempDirectoryWithPrefix() throws IOException {

		File tempDirectory = createTempDirectory("prefix");

		assertNotNull(tempDirectory);

		assertTrue(tempDirectory.exists());
		assertTrue(tempDirectory.isDirectory());
		assertTrue(tempDirectory.getName().contains("prefix"));
	}

	@Test
	public void testCreateTempFileNoPrefixAndSuffix() throws IOException {

		File tempFile = createTempFile();

		assertNotNull(tempFile);

		assertTrue(tempFile.exists());
		assertTrue(tempFile.isFile());
		assertTrue(tempFile.getName().contains(TempFileHelper.DEFAULT_PREFIX));
		assertTrue(tempFile.getName().contains(TempFileHelper.DEFAULT_SUFFIX));
	}

	@Test
	public void testCreateTempFileWithPrefix() throws IOException {

		File tempFile = createTempFile("prefix", "suffix");

		assertNotNull(tempFile);

		assertTrue(tempFile.exists());
		assertTrue(tempFile.isFile());
		assertTrue(tempFile.getName().contains("prefix"));
		assertTrue(tempFile.getName().contains("suffix"));
	}

}
