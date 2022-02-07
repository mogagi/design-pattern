
package com.mblinn.oo.strategy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mblin.oo.strategy.FullNameValidator;
import com.mblin.oo.strategy.Person;
import org.junit.Before;
import org.junit.Test;

public class FullNameValidatorTest {

	FullNameValidator fullNameValidator;
	
	@Before
	public void setup(){
		fullNameValidator = new FullNameValidator();
	}
	
	@Test
	public void fullNameValidator_returnsTrueWhenAllNamesAreSet(){
		Person john = new Person("John", "Quincy", "Adams");
		assertTrue(fullNameValidator.validate(john));
	}
	
	@Test
	public void fullNameValidator_returnsFalseWhenAnyNameNotSet(){
		Person john = new Person("John", null, "Adams");
		assertFalse(fullNameValidator.validate(john));
		john = new Person(null, "Quincy", "Adams");
		assertFalse(fullNameValidator.validate(john));
		john = new Person("John", "Quincy", null);
		assertFalse(fullNameValidator.validate(john));
	}
}
