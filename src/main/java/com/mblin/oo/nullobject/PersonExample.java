package com.mblin.oo.nullobject;

import java.util.HashMap;
import java.util.Map;

/**
 * Replacing Null Object. To avoid scattering null checks throughout our code by encapsulating the
 * action taken for null references into a surrogate null object.
 *
 * @author casa
 * @since 2022/2/7 19:56
 */
public class PersonExample {
    private Map<Integer, Person> people = new HashMap<>();

    public Person fetchPerson(Integer id) {
        return people.getOrDefault(id, new NullPerson());
    }
    // Code to add/remove people

    public Person buildPerson(String firstName, String lastName) {
        return (null != firstName && null != lastName) ? new RealPerson(firstName, lastName) : new NullPerson();
    }
}