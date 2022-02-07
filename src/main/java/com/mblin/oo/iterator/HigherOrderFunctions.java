package com.mblin.oo.iterator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HigherOrderFunctions {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public static Integer sumSequence(List<Integer> sequence) {
        return sequence.stream().reduce(Integer::sum).orElse(0);
    }

    public static List<String> prependHello(List<String> names) {
        return names.stream().map(n -> "Hello, " + n).collect(Collectors.toList());
    }

    public static Set<Character> vowelsInWord(String word) {
        var vowelsInWord = new HashSet<Character>();
        for (Character character : word.toLowerCase().toCharArray()) {
            if (VOWELS.contains(character)) {
                vowelsInWord.add(character);
            }
        }
        return vowelsInWord;
    }
}