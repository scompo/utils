package com.github.scompo.utils.helpers;

import static com.github.scompo.utils.helpers.TempFileHelper.createTempDirectory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TempFileHelperTest {

	@Test
	public void testCreateTempDirectory() throws IOException {

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

}
