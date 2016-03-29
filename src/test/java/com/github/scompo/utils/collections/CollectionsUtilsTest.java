package com.github.scompo.utils.collections;

import static com.github.scompo.utils.collections.CollectionsUtils.getOnlyElement;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CollectionsUtilsTest {

	private static final Long FIRST_ELEMENT = 1L;
	private static final Long SECOND_ELEMENT = 2L;

	private static final List<Long> COLLECTION_WITH_ONLY_ONE_ELEMENT = Arrays.asList(FIRST_ELEMENT);
	private static final List<Long> COLLECTION_WITH_MORE_THAN_ONE_ELEMENT = Arrays.asList(FIRST_ELEMENT, SECOND_ELEMENT);
	private static final Collection<Object> EMPTY_COLLECTION = Collections.emptyList();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void getOnlyElementShouldReturnTheOnlyElementIfTheCollectionHasOnlyOneElement() {

		assertEquals(FIRST_ELEMENT, getOnlyElement(COLLECTION_WITH_ONLY_ONE_ELEMENT));
	}
	
	@Test
	public void getOnlyElementShouldThrowIllegalArgumentExceptionIfTheCollectionHasMoreThanOneElement() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Expected one element, found: 2");
		
		getOnlyElement(COLLECTION_WITH_MORE_THAN_ONE_ELEMENT);
	}
	
	@Test
	public void getOnlyElementShouldThrowIllegalArgumentExceptionIfTheCollectionHasNoElements() {
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Expected one element, found: 0");
		
		getOnlyElement(EMPTY_COLLECTION);
	}

}
