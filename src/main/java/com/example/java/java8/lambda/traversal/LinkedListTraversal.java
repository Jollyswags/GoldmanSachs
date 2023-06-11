package com.example.java.java8.lambda.traversal;

import java.util.LinkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.forEach((a) -> System.out.println(a));
    }

}
