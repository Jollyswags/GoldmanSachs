package com.example.java.java9.takedrop;

import java.util.stream.Stream;

public class takedropwhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,3,2,1).filter(i->i<4).forEach(System.out::print);
        System.out.println();
        Stream.of(1,2,3,4,5,6,7,8,9,3,2,1).takeWhile(i->i<4).forEach(System.out::print);
        System.out.println();
        Stream.of(1,2,3,4,5,6,7,8,9,3,2,1).dropWhile(i->i<4).forEach(System.out::print);


    }
}
