package com.mblin.oo.strategy;

import java.util.ArrayList;
import java.util.List;

public class PersonCollector {
    private PersonValidator personValidator;
    private List<Person> validPeople;

    public PersonCollector(PersonValidator personValidator) {
        this.personValidator = personValidator;
        this.validPeople = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (personValidator.validate(person)) {
            validPeople.add(person);
        }
    }

    public List<Person> getValidPeople() {
        return validPeople;
    }
}