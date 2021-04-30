package com.teran;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        Supplier<Integer> cache = () -> 124;
        Optional<Integer> query = Optional.empty();
        System.out.println(query.orElseGet(cache));

    }

}
