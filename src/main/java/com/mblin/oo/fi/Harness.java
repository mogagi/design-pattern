package com.mblin.oo.fi;

import java.util.Comparator;

public class Harness {

    public static void main(String[] args) {
        Comparator<PersonExpanded> firstAndLastNameComparator =
                new ComposedComparator<PersonExpanded>(
                        new FirstNameComparator(),
                        new LastNameComparator());
        PersonExpanded personOne = new PersonExpanded("John", "", "Adams");
        PersonExpanded personTwo = new PersonExpanded("John", "Quincy", "Adams");
        System.out.println(firstAndLastNameComparator.compare(personOne, personTwo));
    }
}

class FirstNameComparator implements Comparator<PersonExpanded> {
    @Override
    public int compare(PersonExpanded personOne, PersonExpanded personTwo) {
        return personOne.getFirstName().compareTo(personTwo.getFirstName());
    }
}

class LastNameComparator implements Comparator<PersonExpanded> {
    @Override
    public int compare(PersonExpanded personOne, PersonExpanded personTwo) {
        return personOne.getLastName().compareTo(personTwo.getLastName());
    }
}