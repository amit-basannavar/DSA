package com.practice.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachCharacterInGivenString {
    public static void main(String[] args) {
        String input = "Om Shree Guru Raghavendray Namaha";
        Map<String, Long> output = Arrays.stream(input.split(""))
                .filter(x->!x.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(output);
    }
}
