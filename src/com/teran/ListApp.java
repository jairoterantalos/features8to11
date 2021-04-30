package com.teran;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(List.of("Bananas", "Melon", "Watermelon", "Manzana"));

        fruits.forEach(System.out::println);

        fruits.removeIf("Bananas"::equals);

        //fruits.removeIf(s->"Bananas".equals(s));

        //fruits.sort(Comparator.reverseOrder());
        fruits.sort(Comparator.naturalOrder());

        System.out.println("After sort: ");

        fruits.forEach(System.out::println);

    }

}
