package com.mblin.oo.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheLambdaBarAndGrille {

    public Map<Integer, List<String>> peopleByZip(List<Person> people) {
        Map<Integer, List<String>> closePeople = new HashMap<>();
        for (Person person : people) {
            Integer zipCode = person.getAddress().getZipCode();
            if (isCloseZip(zipCode)) {
                List<String> peopleForZip = closePeople.get(zipCode);
                closePeople.put(zipCode, addPerson(peopleForZip, person));
            }
        }
        return closePeople;
    }

    private List<String> addPerson(List<String> people, Person person) {
        if (null == people) {
            people = new ArrayList<>();
        }
        people.add(person.getName());
        return people;
    }

    private Boolean isCloseZip(Integer zipCode) {
        return zipCode == 19123 || zipCode == 19103;
    }
}