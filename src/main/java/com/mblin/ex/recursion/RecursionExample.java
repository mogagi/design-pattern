package com.mblin.ex.recursion;

import java.util.List;

public class RecursionExample {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        var result = addList(list);
        System.out.println(result);
    }

    public static Integer addList(List<Integer> list) {
        if (list.size() == 1) { // return if the list contain only one element
            return list.get(0);
        }
        // otherwise, return the result of adding the first item in the list, to the rest of the list added together
        var first = list.get(0);
        var rest = list.subList(1, list.size());
        return first + addList(rest);
    }
}