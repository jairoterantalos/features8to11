package com.teran;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApp {



    public static void main(String[] args) {


        List<String> fruits = List.of("Banana", "Melon", "Watermelon");

        fruits.stream().sorted().collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList)).forEach(System.out::println);

        fruits.stream().sorted().collect(Collectors.toUnmodifiableList()).forEach(System.out::println);

        Map<Boolean, List<String>> startWithB = fruits.stream().collect(Collectors.partitioningBy(f -> f.startsWith("B")));

        System.out.println("Start with B " + startWithB);

        var initials = fruits.stream().collect(Collectors.groupingBy(s -> s));

        System.out.println("Initials: " + initials);

    }

}
