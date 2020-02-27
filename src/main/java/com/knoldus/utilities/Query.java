package com.knoldus.utilities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Query {
    public static List<String> startWith(List<String> list, String startsWith) {
        return list.stream().filter(string -> string
                .startsWith(startsWith.toLowerCase()) || string.startsWith(startsWith.toUpperCase()))
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> multiply(List<Integer> list1, List<Integer> list2) {
        if (list1.size() == list2.size()) {
            
            for (int ele1 : list1) {

            }

            return list1.stream()
                    .flatMap(number1 -> list2.stream().map(number2 -> number1 * number2))
                    .collect(Collectors.toList());
        }
        else return Collections.emptyList();
    }
}
