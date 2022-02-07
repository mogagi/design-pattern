package com.mblin.oo.strategy;

/**
 * Replacing Strategy.
 * To define an algorithm in abstract terms so it can be implemented in several
 * different ways, and to allow it to be injected into clients so it can be used
 * across several different clients.
 *
 * @author casa
 * @since 2022/2/7 19:50
 */
public interface PersonValidator {
    boolean validate(Person person);
}