package com.mblin.oo.strategy;

public class FirstNameValidator implements PersonValidator {
	@Override
	public boolean validate(Person person) {
		return person.getFirstName() != null;
	}
}