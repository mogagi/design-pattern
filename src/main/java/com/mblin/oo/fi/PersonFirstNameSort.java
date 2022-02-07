
package com.mblin.oo.fi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonFirstNameSort {
    public static void main(String[] args) {
        var p1 = new Person("Mike", "Bevilacqua");
        var p2 = new Person("Pedro", "Vasquez");
        var p3 = new Person("Robert", "Aarons");
        var people = new ArrayList<>(List.of(p1, p2, p3));
        people.sort(Comparator.comparing(Person::getFirstName));
        people.forEach(System.out::println);
    }
}
