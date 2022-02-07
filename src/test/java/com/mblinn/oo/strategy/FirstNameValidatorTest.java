
package com.mblinn.oo.strategy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.mblin.oo.strategy.FirstNameValidator;
import com.mblin.oo.strategy.Person;
import org.junit.Before;
import org.junit.Test;

public class FirstNameValidatorTest {

	private FirstNameValidator firstNameValidator;
	
	@Before
	public void setup(){
		firstNameValidator = new FirstNameValidator();
	}
	
	@Test
	public void fullNameValidator_returnsTrueWhenFirstNameIsSet(){
		Person john = new Person("John", "Quincy", "Adams");
		assertTrue(firstNameValidator.validate(john));
		john = new Person("John", null, "Adams");
		assertTrue(firstNameValidator.validate(john));
		john = new Person("John", "Quincy", null);
		assertTrue(firstNameValidator.validate(john));

	}
	
	@Test
	public void fullNameValidator_returnsFalseWhenFirstNameNotSet(){
		Person john = new Person(null, "Quincy", "Adams");
		assertFalse(firstNameValidator.validate(john));
	}
}
