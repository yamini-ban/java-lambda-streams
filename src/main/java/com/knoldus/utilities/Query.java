package com.knoldus.utilities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Query {
    /**
     * This method lists all the elements which starts with the given string.
     * @param list to be traversed.
     * @param startsWith to check the element.
     * @return list of matched elements.
     */
    public static List<String> startWith(List<String> list, String startsWith) {
        return list.stream().filter(string -> string
                .startsWith(startsWith.toLowerCase()) || string.startsWith(startsWith.toUpperCase()))
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * This method multiply two lists.
     * @param list1 to multiply with another list.
     * @param list2 to multiply with prior list.
     * @return list of product of both the lists.
     */
    public static List<Integer> multiply(List<Integer> list1, List<Integer> list2) {
        if (list1.size() == list2.size()) {
            return IntStream
                    .range(0, list1.size()).map(i -> list1.get(i) * list2.get(i))
                    .boxed()
                    .collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}
