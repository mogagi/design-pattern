package com.mblin.oo.javabean;

/**
 * Chain of Operations. To chain a sequence of computations together—this allows us to work
 * cleanly with immutable data without storing lots of temporary results.
 *
 * @author casa
 * @since 2022/2/7 19:59
 */
public class PersonHarness {

    public static void main(String[] args) {
        var p = ImmutablePerson.newBuilder().firstName("Peter").lastName("Jones").build();
        System.out.println(p);
    }
}