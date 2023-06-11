package com.example.java.java8.isPresent;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name=Optional.of("Swagata");
        System.out.println(name.isPresent());
        System.out.println(name.isEmpty());

        Optional<String> var=Optional.empty();
        System.out.println(var.isPresent());
        System.out.println(var.isEmpty());

    }
}
