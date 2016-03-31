package com.github.scompo.utils.helpers;

import static com.github.scompo.utils.helpers.TempFileHelper.createTempDirectory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TempFileHelperTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

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
