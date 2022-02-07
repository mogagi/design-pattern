package com.mblin.oo.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComplicatedSort {

    public static void main(String[] args) {
        var people = new ArrayList<PersonExpanded>();
        people.add(new PersonExpanded("Aaron", "Jeffrey", "Smith"));
        people.add(new PersonExpanded("Aaron", "Bailey", "Zanthar"));
        people.add(new PersonExpanded("Brian", "Adams", "Smith"));
        people.sort(new ComplicatedNameComparator());
		people.forEach(System.out::println);
    }
}