package com.mblin.oo.strategy;

public class FullNameValidator implements PersonValidator {
    @Override
    public boolean validate(Person person) {
        return person.getFirstName() != null
                && person.getMiddleName() != null
                && person.getLastName() != null;
    }
}