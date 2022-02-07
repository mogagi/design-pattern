package com.mblin.fp.intro;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOdds {

    public List<Integer> filterOdds(List<Integer> list) {
        return list.stream().filter(this::isOdd).collect(Collectors.toList());
    }

    private boolean isOdd(Integer num) {
        return 0 != num % 2;
    }
}