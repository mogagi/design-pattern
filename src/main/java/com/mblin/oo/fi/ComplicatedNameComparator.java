package com.mblin.oo.fi;

import java.util.Comparator;

public class ComplicatedNameComparator implements Comparator<PersonExpanded> {
    public int compare(PersonExpanded p1, PersonExpanded p2) {
        var firstNameCompare = p1.getFirstName().compareTo(p2.getFirstName());
        var lastNameCompare = p1.getLastName().compareTo(p2.getLastName());
        var middleNameCompare = p1.getMidName().compareTo(p2.getMidName());

        if (0 != firstNameCompare) return firstNameCompare;
        else if (0 != lastNameCompare) return lastNameCompare;
        else return middleNameCompare;
    }
}