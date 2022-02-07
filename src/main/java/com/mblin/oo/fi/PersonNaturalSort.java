
package com.mblin.oo.fi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonNaturalSort {

    public static void main(String[] args) {
        Person p1 = new Person("Mike", "Bevilacqua"), p2 = new Person("Pedro", "Vasquez"), p3 = new Person("Robert", "Aarons");
        var peoples = new ArrayList<>(List.of(p1, p2, p3));
        Collections.sort(peoples);
        peoples.forEach(System.out::println);
    }
}
