package com.mblin.ex.repeating;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class VowelFilter {
    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public Collection<Character> vowelsInWord(String word) {
        var vowelsInString = new HashSet<Character>();
        for (Character character : word.toLowerCase().toCharArray()) {
            if (vowels.contains(character)) {
                vowelsInString.add(character);
            }
        }
        return vowelsInString;
    }
}